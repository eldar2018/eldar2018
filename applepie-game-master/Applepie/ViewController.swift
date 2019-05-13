//
//  ViewController.swift
//  Applepie
//
//  Created by Student on 16/11/2018.
//  Copyright © 2018 Student. All rights reserved.
///Users/student/Desktop/1898/Applepie/Applepie/Base.lproj/Main.storyboard

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var treeImageView: UIImageView!
    
    @IBOutlet var letterButtons: [UIButton]!
    
    @IBOutlet weak var correctWordlabel: UILabel!
    
    @IBOutlet weak var scoreLabel: UILabel!

    
    @IBOutlet weak var scoresLabel: UILabel!
    
    var listOfWords = [
        "арбуз",
        "банан",
        "вертолет",
        "гроза",
        "дом",
        ]
    
    
    let incorrectMovesAllowed = 7
    
    var totalWins = 0 {
        didSet {
            newRound()
        }
    }
    
    var scores = 0 {
        didSet {
            newRound()
        }
    }
    var totalLosses = 0 {
        didSet {
            newRound()
        }
    }
    
    var currentGame: Game!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        newRound()
        
    }
    
    func newRound() {
        if !listOfWords.isEmpty {
            let newWord = listOfWords.removeFirst()
            currentGame = Game(word: newWord, incorrectMovesRemaining: incorrectMovesAllowed, guessedLetters:[])
        
            enableLetterButtons(true)
        } else {
            enableLetterButtons(false)
        }
        updateUI()
    }
    
    func enableLetterButtons(_ enable: Bool) {
        for button in letterButtons {
            button.isEnabled = enable
        }
    }
    func updateUI() {
        let imageName = "Tree \(currentGame.incorrectMovesRemaining)"
        let image = UIImage(named: imageName)      
        
        treeImageView.image = image
        
        var letters = [String] ()
        for letter in currentGame.formattedWord {
            letters.append(String(letter))
        }
        
        let wordWithSpaces = letters.joined(separator: " ")

        
        correctWordlabel.text = wordWithSpaces
        scoreLabel.text = "Выйгрыши: \(totalWins), проигрыши: \(totalLosses)"
        scoresLabel.text = "Очки \(scores)"
        
        
    }

    @IBAction func buttonTapped(_ sender: UIButton) {
        sender.isEnabled = false
        let letterString = sender.title(for: .normal)!
        let letter = Character(letterString.lowercased())
        currentGame.playerGuessed(letter: letter)
        updateGameState()
    }
    
    func updateGameState() {
        if currentGame.incorrectMovesRemaining < 1 {
            totalLosses += 1
        } else if currentGame.word == currentGame.formattedWord {
            totalWins += 1
            scores += 5
        } else {
            updateUI()
        }
        updateUI()
        
    }
}

