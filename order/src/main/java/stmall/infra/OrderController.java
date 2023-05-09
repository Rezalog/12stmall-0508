package stmall.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stmall.domain.*;

@RestController
// @RequestMapping(value="/orders")
@Transactional
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @RequestMapping(
        value = "orders/",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Order cancel(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody Order order
    ) throws Exception {
        System.out.println("##### /order/cancel  called #####");
        order.cancel(cancelcommand);
        orderRepository.save(order);
        return order;
    }

    @RequestMapping(
        value = "orders/",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Order order(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody Order order
    ) throws Exception {
        System.out.println("##### /order/order  called #####");
        order.order(ordercommand);
        orderRepository.save(order);
        return order;
    }
}
