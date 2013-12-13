package org.woehlke.addresslist.services.impl;

import org.woehlke.addresslist.entities.Address;
import org.woehlke.addresslist.services.AddressService;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 13.12.13
 * Time: 08:35
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class AddressServiceImpl implements AddressService {

    @PersistenceContext(unitName="addresslist")
    private EntityManager entityManager;

    @Override public List<Address> getAllAddresses() {
        Query q = entityManager.createQuery("select a from Address a");
        @SuppressWarnings("unchecked")
        List<Address> list =  q.getResultList();
        return list;
    }

    @Override
    public void delete(long id) {
        Address address = entityManager.find(Address.class, id);
        entityManager.remove(address);
    }

    @Override
    public void addNewAddress(Address address) {
        entityManager.persist(address);
    }
}
