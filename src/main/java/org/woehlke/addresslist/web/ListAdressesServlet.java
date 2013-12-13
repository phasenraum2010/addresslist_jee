package org.woehlke.addresslist.web;

import org.woehlke.addresslist.entities.Address;
import org.woehlke.addresslist.services.AddressService;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 12.12.13
 * Time: 09:38
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/home")
public class ListAdressesServlet extends HttpServlet {

    @EJB
    private AddressService addressService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Address> addresses = addressService.getAllAddresses();
        request.setAttribute("addresses", addresses);
        String nextJSP = "/home.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Displays the List of addresses.";
    }
}
