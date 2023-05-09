package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Integer qty;
    private String orderId;
    private String productId;
    private String productName;
    private String status;
}
