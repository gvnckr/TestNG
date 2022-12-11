package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

      static {
          String dosyayolu="configuration.properties";
          try {
              FileInputStream fis=new FileInputStream(dosyayolu);
              properties = new Properties();
              properties.load(fis);//fisin okudugu bilgileri propertiese yukledi

          } catch (IOException e) {
              throw new RuntimeException(e);
          }
      }


    public static String getProperty(String key) {
              /*
        test metodundan yolladığımız string key değerini alıp
        Properties class'ından getProperty() methodunu kullanarak
        bu key'e ait value'yu bize getirir
         */

        return properties.getProperty(key);
    }


}
