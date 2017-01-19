package Controller.DAO;

import Controller.Metod.CharacteristicController.CharacteristicLensController;
import Controller.Metod.CharacteristicController.CharacteristicPhotoController;
import Controller.Metod.CharacteristicController.CharacteristicVideoController;
import Controller.Metod.ProductController.AccessoryController;
import Controller.Metod.ProductController.LensController;
import Controller.Metod.ProductController.PhotoController;
import Controller.Metod.ProductController.VideoController;

/**
 * Created by alisa on 14.01.2017.
 */
public class Commander{
    public static PhotoController doPhotoController(){
        PhotoController photo=new PhotoController();
        return  photo;
    }
    public static VideoController doVideoController(){
        VideoController video=new VideoController();
        return  video;
    }
    public static LensController doLensController(){
        LensController lens=new LensController();
        return  lens;
    }
    public static AccessoryController doAccessoryController(){
        AccessoryController accessory=new AccessoryController();
        return  accessory;
    }
    public static CharacteristicPhotoController doCharacteristicPhotoController(){
        CharacteristicPhotoController photo=new CharacteristicPhotoController();
        return  photo;
    }
    public static CharacteristicVideoController doCharacteristicVideoController(){
        CharacteristicVideoController video=new CharacteristicVideoController();
        return  video;
    }
    public static CharacteristicLensController doCharacteristicLensController(){
        CharacteristicLensController lens=new CharacteristicLensController();
        return  lens;
    }
}
