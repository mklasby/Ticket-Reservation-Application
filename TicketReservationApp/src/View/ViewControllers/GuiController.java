package View.ViewControllers;

import Controller.*;

import org.json.JSONArray;
import org.json.JSONObject;

import CommonMessage.Message;

public class GuiController {
    public BossController boss = new BossController();
    public boolean isRegistered = false;
    public boolean isManager = false;

    public boolean isIsRegistered() {
        return this.isRegistered;
    }

    public boolean getIsRegistered() {
        return this.isRegistered;
    }

    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public boolean isIsManager() {
        return this.isManager;
    }

    public boolean getIsManager() {
        return this.isManager;
    }

    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }

    public Message login(String username, String password) {
        return boss.login(username, password);
    }

    public void logout() {
        boss.logoutUser();
    }

    public Message getMovieList() {
        Message response = boss.getMovieList();
        return response;
    }

    public Message selectMovie(JSONObject movie) {
        Message response = boss.selectMovie(movie);
        return response;
    }

    public Message getTheatreList() {
        return boss.getTheatreList();
    }

    public Message selectTheatre(JSONObject theatre) {
        Message response = boss.selectTheatre(theatre);
        return response;
    }

    public Message selectShowTime(JSONObject showTime) {
        Message response = boss.selectShowTime(showTime);
        return response;
    }

    public JSONArray getSeatList() {
        return boss.getSeatList();
    }

    public Message selectSeat(JSONObject seat) {
        return null;
    }

    public Message registerNewUser(String username, String password, String name, String address, String email,
            String cardNum, String cardType) {
        Message response = boss.registerNewUser(username, password, name, address, email, cardNum, cardType);
        return response;

    }

    public boolean isRefundValid(int ticketNum) {
        return false;
    }

    public Message refundTicket(int ticketNum) {
        return boss.refundTicket(ticketNum);
    }

    public Message uploadMovieNews(String fieldText) {
        return null;
    }
}
