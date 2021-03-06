/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.Cart;
import Model.CartItemViewModel;
import java.util.List;

/**
 *
 * @author Nguyen Manh Cuong
 */
public interface ICartDAO {
    void addItemToCart(Cart shipCart);
    int getTotalItemOnCartByCustomerID(int customerId);
    List<CartItemViewModel> getAllCartItems(int customerid);
    Cart getCartItem(int userId, int bookId);
    boolean updateCart(int quantity, float totalPrice,int customerId, int bookId);
    CartItemViewModel findCartById(int cartId);
    boolean updateStateOnCart(String description, int cartId);
}
