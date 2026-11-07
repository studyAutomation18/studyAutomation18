package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hrmAdminPage extends BasePage {
                // Sidebar
                private static final By MENU_ADMIN = By.xpath("//span[text()='Admin']");
                private static final By MENU_PIM = By.xpath("//span[text()='PIM']");
                private static final By MENU_LEAVE = By.xpath("//span[text()='Leave']");

                // Form tìm kiếm
                private static final By INPUT_USERNAME = By.xpath("//label[text()='Username']/../following-sibling::div/input");
                private static final By DROPDOWN_USER_ROLE = By.xpath("//label[text()='User Role']/../following-sibling::div//div[contains(@class,'oxd-select-text')]");
                private static final By CHOICE_ADMIN_USER_ROLE = By.xpath("//div[@role='listbox']//span[normalize-space()='Admin']");
                private static final By SELECTED_USER_ROLE_ADMIN = By.xpath("//label[text()='User Role']/../following-sibling::div//div[@class='oxd-select-text-input']");
                private static final By CHOICE_ESS_USER_ROLE = By.xpath("//div[@role='listbox']//span[normalize-space()='ESS']");
                private static final By SELECTED_USER_ROLE_ESS = By.xpath ("//label[text()='User Role']/../following-sibling::div//div[@class='oxd-select-text-input' and text()='ESS']");
                private static final By INPUT_EMPLOYEE_NAME = By.xpath("//label[normalize-space()='Employee Name']/following::input[1]");
                private static final By CLICK_RESET_BUTTON = By.xpath("//button[normalize-space()='Reset']");
                private static final By CLICK_SEARCH_BUTTON = By.xpath("//button[normalize-space()='Search']");
                private static final By CLICK_USER_MANAGEMENT= By.xpath("//span[normalize-space()='User Management']");
                private static final By CHECKBOX_USER_1= By.xpath("(//div[@class='oxd-table-body']/div[contains(@class,'oxd-table-card')])[2]//span[contains(@class,'oxd-checkbox-input')]");
                private static final By CHECKBOX_USER_1_INPUT= By.xpath("(//div[@class='oxd-table-body']/div[contains(@class,'oxd-table-card')])[2]//input[@type='checkbox']");
                private static final By USER_ROLE_1= By.xpath("//div[@class='oxd-table-body']/div[2]//div[@role='cell'][3]/div");
                private static final By DELETE_ICON =By.xpath("//div[@class='oxd-table-body']/div[2]//button[.//i[contains(@class,'bi-trash')]]");
                private static final By EDIT_ICON = By.xpath("//div[@class='oxd-table-body']/div[2]//button[.//i[contains(@class,'bi-pencil')]]");
                private static final By HEADER_USER_ROLE = By.xpath("//div[contains(@class,'oxd-table-header-cell')][contains(normalize-space(.),'User Role')]");
                private static final By HEADER_EMPLOYEE_NAME = By.xpath("//div[contains(@class,'oxd-table-header-cell')][contains(normalize-space(.),'Employee Name')]");
                private static final By BREAKCRUMB = By.cssSelector(".oxd-topbar-header-breadcrumb");
                private static final By SIDEBAR_ICON = By.cssSelector("button.oxd-main-menu-button");
                private static final By CHERVON_ICON = By.xpath("//div[contains(@class,'oxd-table-filter-header-options')]//button[contains(@class,'oxd-icon-button')]");
                private static final By ADD_BUTTON = By.xpath("//button[normalize-space()='Add']");
                // Login
    private static final String LOGIN_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    private static final By LOGIN_USERNAME = By.xpath("//input[@name='username']");
    private static final By LOGIN_PASSWORD = By.xpath("//input[@name='password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

    public hrmAdminPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open() {
        driver.get(LOGIN_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_USERNAME));
    }

    public void login(String username, String password) {
        type(LOGIN_USERNAME, username);
        type(LOGIN_PASSWORD, password);
        click(LOGIN_BUTTON);
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }


                public void clickMenuAdmin()        { click(MENU_ADMIN); }
                public void clickMenuPIM()          { click(MENU_PIM); }
                public void clickMenuLeave()        { click(MENU_LEAVE); }
                public void enterUsername(String u) { type(INPUT_USERNAME, u); }
                public String getUsername()         { return getValue(INPUT_USERNAME); }
                public void clickUserRole()         { click(DROPDOWN_USER_ROLE); }
                public void choiceAdminUserRole() {
                    wait.until(ExpectedConditions.elementToBeClickable(CHOICE_ADMIN_USER_ROLE)).click();
                }
                public String getSelectedUserRoleAdmin() {
                    return driver.findElement(SELECTED_USER_ROLE_ADMIN).getText();
                }
                public void choiceESSUserRole()     {
                    wait.until(ExpectedConditions.elementToBeClickable(CHOICE_ESS_USER_ROLE)).click();
                }
                public String getSelectedUserRoleESS(){
                    return driver.findElement(SELECTED_USER_ROLE_ESS).getText();
                }
                public void enterEmployeeName(String E) { type(INPUT_EMPLOYEE_NAME, E);
                }
                public String getEmployeeName() { return getValue(INPUT_EMPLOYEE_NAME);
                }

                public void clickResetButton(){click(CLICK_RESET_BUTTON);
                }
                public void clickSearchButton(){click(CLICK_SEARCH_BUTTON);
                }

                public void setClickUserManagement() {
                    click(CLICK_USER_MANAGEMENT);
                }
                public void clickCheckboxUser2() {
                    click(CHECKBOX_USER_1);
                }
                public boolean isCheckboxUser2Selected() {
                    return driver.findElement(CHECKBOX_USER_1_INPUT).isSelected();
                }
                public String getUserRole1() {
                    return driver.findElement(USER_ROLE_1).getText();
                }
                public void clickDeleteIcon() {
                    click(DELETE_ICON);
                }
                public void clickEditIcon() {
                    click(EDIT_ICON);
                }
                public void clickHeaderUserRole(){
                    click(HEADER_USER_ROLE);
                }
                public void clickHeaderEmployeeName(){
                    click(HEADER_EMPLOYEE_NAME);
                }
                public void clickBreakcrumb(){
                    click(BREAKCRUMB);
                }
                public void clickSidebarIcon(){
                    click(SIDEBAR_ICON);
                }
                public void clickChervonIcon(){
                    click(CHERVON_ICON);
                }
                public void clickAddButton(){
                    click(ADD_BUTTON);
                }
}

