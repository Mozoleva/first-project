package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.BaseFunc;

public class CatalogTests {
    private final String HOME_PAGE_URL = "http://1a.lv";

    @Test
    public void productDetailsCheck() {
        BaseFunc baseFunc = new BaseFunc(); //Student(tip dannih, kak String) nikita(peremennaja) = new Student();
        baseFunc.openUrl(HOME_PAGE_URL);
    }
}
