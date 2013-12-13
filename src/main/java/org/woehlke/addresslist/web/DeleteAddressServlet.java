package org.woehlke.addresslist.web;

import org.woehlke.addresslist.services.AddressService;

import javax.ejb.EJB;
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
 * Time: 19:35
 * To change this template use File | Settings | File Templates.
 */
@WebServlet("/delete")
public class DeleteAddressServlet extends HttpServlet {

    @EJB
    private AddressService addressService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idString = request.getParameter("id");
        System.out.println(idString);
        long id = Long.parseLong(idString);
        addressService.delete(id);
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/home");
    }

    @Override
    public String getServletInfo() {
        return "deletes an address.";
    }
}
