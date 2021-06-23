package pages;

import io.appium.java_client.AppiumDriver;

public class PageObjectManager {

    private AppiumDriver driver;
    private HomePage homePage;
    private ContentsPage contentsPage;
    private OSPage osPage;
    private PreferencesPage preferencesPage;
    private ViewsPage viewsPage;


    public PageObjectManager(AppiumDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public ContentsPage contentsPage() {
        return (contentsPage == null) ? contentsPage = new ContentsPage(driver) : contentsPage;
    }

    public OSPage osPage() {
        return (osPage == null) ? osPage = new OSPage(driver) : osPage;
    }

    public PreferencesPage preferencesPage() {
        return (preferencesPage == null) ? preferencesPage = new PreferencesPage(driver) : preferencesPage;
    }
    public ViewsPage viewsPage() {
        return (viewsPage == null) ? viewsPage = new ViewsPage(driver) : viewsPage;
    }
}
