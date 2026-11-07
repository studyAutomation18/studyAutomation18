package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.hrmAdminPage;

public class hrmAdminPageTest extends BaseTest {
    private hrmAdminPage adminPage;

    @BeforeMethod
    public void precondition() {
        adminPage = new hrmAdminPage(driver, wait);
        adminPage.open();
        adminPage.login("Admin", "admin123");
    }

    @Test(description = "Menu Admin")
    public void findLocatorAdmin() {
        adminPage.clickMenuAdmin();
        Assert.assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"));
    }

    @Test(description = "Menu PIM")
    public void findLocatorPIM() {
        adminPage.clickMenuPIM();
        Assert.assertTrue(driver.getCurrentUrl().contains("viewEmployeeList"));
    }

    @Test(description = "Menu Leave")
    public void findLocatorLeave() {
        adminPage.clickMenuLeave();
        Assert.assertTrue(driver.getCurrentUrl().contains("viewLeaveList"));
    }

    @Test(description = "Username input")
    public void enterUsername() {
        adminPage.clickMenuAdmin();
        adminPage.enterUsername("Admin");
        Assert.assertEquals(adminPage.getUsername(), "Admin");
    }

    @Test(description = "User Role dropdown")
    public void clickUserRole() {
        adminPage.clickMenuAdmin();
        adminPage.clickUserRole();
    }

    @Test(description = "User choice admin at User role dropdown")
    public void choiceAdminUserRoleAdmin() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickUserRole();
        adminPage.choiceAdminUserRole();

        Thread.sleep(2000);
        Assert.assertEquals(adminPage.getSelectedUserRoleAdmin(), "Admin");
    }

    @Test(description = "User choice ESS at User role dropdown")
    public void choiceESSUserRole() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickUserRole();
        adminPage.choiceESSUserRole();

        Thread.sleep(2000);
        Assert.assertEquals(adminPage.getSelectedUserRoleESS(), "ESS");
    }

    @Test(description = "Employee name input")
    public void enterEmployeeName() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.enterEmployeeName("Admin");
        Thread.sleep(2000);
        Assert.assertEquals(adminPage.getEmployeeName(), "Admin");
    }

    @Test(description = "Reset button click")
    public void clickResetButton() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickResetButton();
        Thread.sleep(2000);
    }

    @Test(description = "Search button click")
    public void clickSearchButton() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickSearchButton();
        Thread.sleep(2000);
    }

    @Test(description = "Click User Management")
    public void clickUserManagement() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.setClickUserManagement();
        Thread.sleep(2000);
    }

    @Test(description = "Click checkbox user 1")
    public void clickCheckboxUser1() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickCheckboxUser2();
        Thread.sleep(2000);
    }

    @Test(description = "Get User role of User 1")
    public void getUserRole1() throws InterruptedException {
        adminPage.clickMenuAdmin();
        Thread.sleep(2000);
        String userRole1 = adminPage.getUserRole1();
        System.out.println("User role of User 1: " + userRole1);
    }

    @Test(description = "Click Delete icon")
    public void clickDeleteIcon() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickDeleteIcon();
        Thread.sleep(2000);
    }

    @Test(description = "Click Edit icon")
    public void clickEditIcon() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickEditIcon();
        Thread.sleep(2000);
    }

    @Test(description = "Click Header User Role")
    public void clickHeaderUserRole() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickHeaderUserRole();
        Thread.sleep(2000);
    }

    @Test(description = "Click Header Employee Name")
    public void clickHeaderEmployeeName() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickHeaderEmployeeName();
        Thread.sleep(2000);
    }

    @Test(description = "Click Breakcrumb")
    public void clickBreakcrumb() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickBreakcrumb();
        Thread.sleep(2000);
    }

    @Test(description = "Click Sidebar Icon")
    public void clickSidebarIcon() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickSidebarIcon();
        Thread.sleep(2000);
    }

    @Test(description = "Click Chervon Icon")
    public void clickChervonIcon() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickChervonIcon();
        Thread.sleep(2000);
    }
    @Test(description = "Click Add Button")
    public void clickAddButton() throws InterruptedException {
        adminPage.clickMenuAdmin();
        adminPage.clickAddButton();
        Thread.sleep(2000);
    }
}

