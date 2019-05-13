
import AVFoundation 
import UIKit

class ViewController: UIViewController {
    @IBAction func buttonPressed() {
        isOn = !isOn
    }
    
    var isOn = true {
        didSet {
            updateUI()
        }
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        updateUI()
    }
    
    func updateUI() {
        let device = AVCaptureDevice.default(for: .video)
        
        if let device = device, device.hasTorch {
                view.backgroundColor = .black
                do {
                    try device.lockForConfiguration()
                    device.torchMode = isOn ? .on : .off
                    device.unlockForConfiguration()
                } catch {
                    print(#function, error)
                }
            }
  //      if isOn {
    //        view.backgroundColor = .white
      //  } else {
     //       view.backgroundColor = .black
      //  }
        view.backgroundColor = isOn ? .white : .black
    }
    override var preferStatusBarHidden: Bool {
        return true 
    }
}

