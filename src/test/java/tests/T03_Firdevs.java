package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.Firdevs;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class T03_Firdevs extends TestBase {
    @Test
    public void test02() throws InterruptedException {

        Firdevs page = new Firdevs();
        Actions actions=new Actions(Driver.getDriver());
        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- Vendor "Giriş yap" butonuna tiklar
        page.girisYap.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        page.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        //Vendor "Parola" inputuna  gecerli parolayi girer
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        //Vendor "GİRİŞ YAP" butonuna tiklar
        page.girisYapButon.click();
        Thread.sleep(5000);
        page.hesabimButton.click();

        //Hesabim yazisi gorunmeli
        Assert.assertTrue(page.hesabimYazisi.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        // Siparisler yazisi gozukmeli
        Assert.assertTrue(page.siparislerKutusu.isDisplayed());
        // Indirimler yazisi gozukmeli
        Assert.assertTrue(page.indirmelerKutusu.isDisplayed());

        // adressler yazisi gozukmeli
        Assert.assertTrue(page.adreslerKutusu.isDisplayed());
        // hesap detaylari yazisi gozukmeli
        Assert.assertTrue(page.hesapDetaylariKutusu.isDisplayed());

        // favorilerim yazisi gozukmeli
        Assert.assertTrue(page.favorilerimKutusu.isDisplayed());
        // cikis yazisi gozukmeli
        Assert.assertTrue(page.cikisKutusu.isDisplayed());
        actions.sendKeys(Keys.PAGE_UP).perform();
        //Dashboard altinda Store Manager gozukmeli
        page.storeManager.isDisplayed();
        //Dashboard altinda Siparisler gozukmeli
        Assert.assertTrue(page.siparislerInDash.isDisplayed());
        //Dashboard altinda indirimler gozukmeli
        Assert.assertTrue(page.indirmelerInDash.isDisplayed());

        //Dashboard altinda adres gozukmeli
        Assert.assertTrue(page.adresInDash.isDisplayed());
        //Dashboard altinda hesap detaylari gozukmeli
        Assert.assertTrue(page.hesapDetaylariInDash.isDisplayed());
        //Dashboard altinda randavular gozukmeli
        Assert.assertTrue(page.randavularInDash.isDisplayed());
        //Dashboard altinda favorilerim gozukmeli
        Assert.assertTrue(page.favorilerimInDash.isDisplayed());
        //Dashboard altinda destek talepleri gozukmeli
        Assert.assertTrue(page.hesapDetaylariInDash.isDisplayed());

        //Dashboard altinda destek talepleri gozukmeli
        Assert.assertTrue(page.destekTalepleriInDash.isDisplayed());
        //Dashboard altinda takip gozukmeli
        Assert.assertTrue(page.cikisInDash.isDisplayed());
        //Dashboard altinda cikis gozukmeli
        Assert.assertTrue(page.cikisInDash.isDisplayed());

    }
    @Test
    public void test09() throws InterruptedException {
        Firdevs page = new Firdevs();
        Actions actions=new Actions(Driver.getDriver());
        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- Vendor "Giriş yap" butonuna tiklar
        page.girisYap.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        page.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        //Vendor "Parola" inputuna  gecerli parolayi girer
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        //Vendor "GİRİŞ YAP" butonuna tiklar
        page.girisYapButon.click();
        Thread.sleep(5000);
        page.hesabimButton.click();
        // vendor "Store Manager" butonuna tiklar
        page.storeManager.click();
        // Urun secenegi ustunde bekle urun ekle tikla
        page.urunlerButonu.click();
        // actions.moveToElement(page.urunEkleButonu).click();

        page.urunEkleButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Shipping tiklanmali
        page.shippingButonu.click();
        //Kilo ve boyut verileri girilmeli
        page.weightText.sendKeys("10");
        page.lengthText.sendKeys("30");
        page.width.sendKeys("40");
        page.height.sendKeys("30");
        //Hacmin Belirlenmeli
        // locate alincak bir yer yok bug
        //teslimat suresinin secilmesi
        WebElement dropDownMenu= driver.findElement(By.xpath("//select[@id='_wcfmmp_processing_time']"));
        Thread.sleep(3000);
        Select select= new Select(dropDownMenu);
        select.selectByVisibleText("1 business day");

    }
    /*
      @AfterMethod
     public void tearDown(){
          driver.quit();
     }
    */
    @Test
    public void test20() throws InterruptedException {
        Firdevs page = new Firdevs();
        Actions actions=new Actions(Driver.getDriver());
        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2- Vendor "Giriş yap" butonuna tiklar
        page.girisYap.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        page.mailTextBox.sendKeys(ConfigReader.getProperty("userName"));

        //Vendor "Parola" inputuna  gecerli parolayi girer
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        //Vendor "GİRİŞ YAP" butonuna tiklar
        page.girisYapButon.click();
        Thread.sleep(5000);
        page.hesabimButton.click();
        // vendor "Store Manager" butonuna tiklar
        page.storeManager.click();
        // incelemeler butonuna tiklanmali
        page.incelemeler.click();
        //Store Review butonuna basilmali

        //Kullanicinin verdigi rate gozukmeli

        //Kullanicinin verdigi Comment gozukmeli
    }
}
