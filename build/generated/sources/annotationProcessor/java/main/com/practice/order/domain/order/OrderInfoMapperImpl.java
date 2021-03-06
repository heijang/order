package com.practice.order.domain.order;

import com.practice.order.domain.order.OrderInfo.DeliveryInfo;
import com.practice.order.domain.order.OrderInfo.DeliveryInfo.DeliveryInfoBuilder;
import com.practice.order.domain.order.OrderInfo.Main;
import com.practice.order.domain.order.OrderInfo.Main.MainBuilder;
import com.practice.order.domain.order.OrderInfo.OrderItem.OrderItemBuilder;
import com.practice.order.domain.order.OrderInfo.OrderItemOption.OrderItemOptionBuilder;
import com.practice.order.domain.order.OrderInfo.OrderItemOptionGroup;
import com.practice.order.domain.order.OrderInfo.OrderItemOptionGroup.OrderItemOptionGroupBuilder;
import com.practice.order.domain.order.fragment.DeliveryFragment;
import com.practice.order.domain.order.item.OrderItem;
import com.practice.order.domain.order.item.OrderItemOption;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-23T15:02:56+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.2.jar, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class OrderInfoMapperImpl implements OrderInfoMapper {

    @Override
    public Main of(Order order, List<OrderItem> orderItemList) {
        if ( order == null && orderItemList == null ) {
            return null;
        }

        MainBuilder main = Main.builder();

        if ( order != null ) {
            main.orderId( order.getId() );
            main.deliveryInfo( deliveryFragmentToDeliveryInfo( order.getDeliveryFragment() ) );
            main.orderToken( order.getOrderToken() );
            main.userId( order.getUserId() );
            main.payMethod( order.getPayMethod() );
            main.orderedAt( order.getOrderedAt() );
            main.orderItemList( orderItemListToOrderItemList( order.getOrderItemList() ) );
        }
        main.totalAmount( order.calculateTotalAmount() );
        main.status( order.getStatus().name() );
        main.statusDescription( order.getStatus().getDescription() );

        return main.build();
    }

    @Override
    public com.practice.order.domain.order.OrderInfo.OrderItem of(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }

        OrderItemBuilder orderItem1 = com.practice.order.domain.order.OrderInfo.OrderItem.builder();

        orderItem1.orderCount( orderItem.getOrderCount() );
        orderItem1.partnerId( orderItem.getPartnerId() );
        orderItem1.itemId( orderItem.getItemId() );
        orderItem1.itemName( orderItem.getItemName() );
        orderItem1.itemPrice( orderItem.getItemPrice() );
        orderItem1.orderItemOptionGroupList( orderItemOptionGroupListToOrderItemOptionGroupList( orderItem.getOrderItemOptionGroupList() ) );

        orderItem1.deliveryStatus( orderItem.getDeliveryStatus().name() );
        orderItem1.deliveryStatusDescription( orderItem.getDeliveryStatus().getDescription() );
        orderItem1.totalAmount( orderItem.calculateTotalAmount() );

        return orderItem1.build();
    }

    @Override
    public OrderItemOptionGroup of(com.practice.order.domain.order.item.OrderItemOptionGroup orderItemOptionGroup) {
        if ( orderItemOptionGroup == null ) {
            return null;
        }

        OrderItemOptionGroupBuilder orderItemOptionGroup1 = OrderItemOptionGroup.builder();

        orderItemOptionGroup1.ordering( orderItemOptionGroup.getOrdering() );
        orderItemOptionGroup1.itemOptionGroupName( orderItemOptionGroup.getItemOptionGroupName() );
        orderItemOptionGroup1.orderItemOptionList( orderItemOptionListToOrderItemOptionList( orderItemOptionGroup.getOrderItemOptionList() ) );

        return orderItemOptionGroup1.build();
    }

    @Override
    public com.practice.order.domain.order.OrderInfo.OrderItemOption of(OrderItemOption orderItemOption) {
        if ( orderItemOption == null ) {
            return null;
        }

        OrderItemOptionBuilder orderItemOption1 = com.practice.order.domain.order.OrderInfo.OrderItemOption.builder();

        orderItemOption1.ordering( orderItemOption.getOrdering() );
        orderItemOption1.itemOptionName( orderItemOption.getItemOptionName() );
        orderItemOption1.itemOptionPrice( orderItemOption.getItemOptionPrice() );

        return orderItemOption1.build();
    }

    protected DeliveryInfo deliveryFragmentToDeliveryInfo(DeliveryFragment deliveryFragment) {
        if ( deliveryFragment == null ) {
            return null;
        }

        DeliveryInfoBuilder deliveryInfo = DeliveryInfo.builder();

        deliveryInfo.receiverName( deliveryFragment.getReceiverName() );
        deliveryInfo.receiverPhone( deliveryFragment.getReceiverPhone() );
        deliveryInfo.receiverZipcode( deliveryFragment.getReceiverZipcode() );
        deliveryInfo.receiverAddress1( deliveryFragment.getReceiverAddress1() );
        deliveryInfo.receiverAddress2( deliveryFragment.getReceiverAddress2() );
        deliveryInfo.etcMessage( deliveryFragment.getEtcMessage() );

        return deliveryInfo.build();
    }

    protected List<com.practice.order.domain.order.OrderInfo.OrderItem> orderItemListToOrderItemList(List<OrderItem> list) {
        if ( list == null ) {
            return null;
        }

        List<com.practice.order.domain.order.OrderInfo.OrderItem> list1 = new ArrayList<com.practice.order.domain.order.OrderInfo.OrderItem>( list.size() );
        for ( OrderItem orderItem : list ) {
            list1.add( of( orderItem ) );
        }

        return list1;
    }

    protected List<OrderItemOptionGroup> orderItemOptionGroupListToOrderItemOptionGroupList(List<com.practice.order.domain.order.item.OrderItemOptionGroup> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItemOptionGroup> list1 = new ArrayList<OrderItemOptionGroup>( list.size() );
        for ( com.practice.order.domain.order.item.OrderItemOptionGroup orderItemOptionGroup : list ) {
            list1.add( of( orderItemOptionGroup ) );
        }

        return list1;
    }

    protected List<com.practice.order.domain.order.OrderInfo.OrderItemOption> orderItemOptionListToOrderItemOptionList(List<OrderItemOption> list) {
        if ( list == null ) {
            return null;
        }

        List<com.practice.order.domain.order.OrderInfo.OrderItemOption> list1 = new ArrayList<com.practice.order.domain.order.OrderInfo.OrderItemOption>( list.size() );
        for ( OrderItemOption orderItemOption : list ) {
            list1.add( of( orderItemOption ) );
        }

        return list1;
    }
}
