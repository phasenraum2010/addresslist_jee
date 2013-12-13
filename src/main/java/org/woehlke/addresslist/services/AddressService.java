package org.woehlke.addresslist.services;

import org.woehlke.addresslist.entities.Address;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 13.12.13
 * Time: 08:37
 * To change this template use File | Settings | File Templates.
 */
public interface AddressService {

    List<Address> getAllAddresses();

    void delete(long id);

    void addNewAddress(Address address);
}
