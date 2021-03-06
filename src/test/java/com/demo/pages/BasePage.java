package com.demo.pages;

public abstract class BasePage <R extends BasePage<R>> {

    protected final WebDriver driver;

    public BasePage (WebDriver driver) {this.driver=driver;}

    protected abstract R getTis();

    static final String Base_URL="https://google.com";

    public R refreshPage() {
        driver.navigate().refresh();
        return getThis();
    }

    public R navigateback(){
        driver.navigate().back();
        return getThis();
    }

    public String getPageURL() { return driver.getCurrentUrl(); }
}
