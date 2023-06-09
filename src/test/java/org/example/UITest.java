package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest extends baseTest {
    SpotifyPageObject spo;

    @Test
    public void loginTest() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void createPlayList() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void EditPayListDetails() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.editPlaylistDetails();
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void SearchSong() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.searchSong("Ram Siya Ram");
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void AddSongToPlayList() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.searchSong("Ram Siya Ram");
        spo.addSongToPlaylist();
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void PlaySong() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.searchSong("Ram Siya Ram");
        spo.addSongToPlaylist();
        spo.playSong();
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void PauseSong() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.searchSong("Ram Siya Ram");
        spo.addSongToPlaylist();
        spo.playSong();
        spo.pauseSong();
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void RemoveSong() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.searchSong("Ram Siya Ram");
        spo.addSongToPlaylist();
        spo.removeSongFromPlaylist();
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void DeletePlayList() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
    @Test
    public void FullTest() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        spo.login();
        spo.createPlaylist();
        spo.editPlaylistDetails();
        spo.searchSong("Ram Siya Ram");
        spo.addSongToPlaylist();
        spo.playSong();
        spo.pauseSong();
        spo.removeSongFromPlaylist();
        spo.deletePlaylist();
        Assert.assertEquals(spo.createButtonVisible(),"Create playlist");
        driver.manage().deleteAllCookies();
    }
}