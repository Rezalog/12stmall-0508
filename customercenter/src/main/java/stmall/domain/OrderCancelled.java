package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productName;
    private String productId;
    private String userId;
    private Integer qty;
    private String status;
}
