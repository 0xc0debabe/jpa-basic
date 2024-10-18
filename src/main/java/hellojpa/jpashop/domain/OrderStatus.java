package hellojpa.jpashop.domain;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;

public enum OrderStatus {
    ORDER, CANCEL

}
