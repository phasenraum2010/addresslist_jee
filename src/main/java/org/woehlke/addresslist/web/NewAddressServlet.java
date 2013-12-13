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

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 13.12.13
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/new")
public class NewAddressServlet extends HttpServlet {

    @EJB
    private AddressService addressService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nextJSP = "/new.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String street = request.getParameter("street");
        String houseNumber = request.getParameter("houseNumber");
        String zip = request.getParameter("zip");
        String city = request.getParameter("city");
        Address address = new Address();
        address.setName(name);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setZip(zip);
        address.setCity(city);
        //Todo: Validation
        addressService.addNewAddress(address);
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/home");
    }

    @Override
    public String getServletInfo() {
        return "Displays and performs a form for a new address.";
    }
}
