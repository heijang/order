package com.practice.order.interfaces.order;

import com.practice.order.domain.order.OrderCommand.PaymentRequest;
import com.practice.order.domain.order.OrderCommand.PaymentRequest.PaymentRequestBuilder;
import com.practice.order.domain.order.OrderCommand.RegisterOrder;
import com.practice.order.domain.order.OrderCommand.RegisterOrder.RegisterOrderBuilder;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItem.RegisterOrderItemBuilder;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItemOption;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItemOption.RegisterOrderItemOptionBuilder;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItemOptionGroup;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItemOptionGroup.RegisterOrderItemOptionGroupBuilder;
import com.practice.order.domain.order.OrderInfo.Main;
import com.practice.order.domain.order.OrderInfo.OrderItem;
import com.practice.order.domain.order.OrderInfo.OrderItemOptionGroup;
import com.practice.order.interfaces.order.OrderDto.DeliveryInfo;
import com.practice.order.interfaces.order.OrderDto.DeliveryInfo.DeliveryInfoBuilder;
import com.practice.order.interfaces.order.OrderDto.Main.MainBuilder;
import com.practice.order.interfaces.order.OrderDto.OrderItem.OrderItemBuilder;
import com.practice.order.interfaces.order.OrderDto.OrderItemOption;
import com.practice.order.interfaces.order.OrderDto.OrderItemOption.OrderItemOptionBuilder;
import com.practice.order.interfaces.order.OrderDto.OrderItemOptionGroup.OrderItemOptionGroupBuilder;
import com.practice.order.interfaces.order.OrderDto.RegisterOrderItem;
import com.practice.order.interfaces.order.OrderDto.RegisterOrderItemOptionGroupRequest;
import com.practice.order.interfaces.order.OrderDto.RegisterOrderItemOptionRequest;
import com.practice.order.interfaces.order.OrderDto.RegisterOrderRequest;
import com.practice.order.interfaces.order.OrderDto.RegisterResponse;
import com.practice.order.interfaces.order.OrderDto.RegisterResponse.RegisterResponseBuilder;
import java.time.format.DateTimeFormatter;
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
public class OrderDtoMapperImpl implements OrderDtoMapper {

    @Override
    public com.practice.order.interfaces.order.OrderDto.Main of(Main mainResult) {
        if ( mainResult == null ) {
            return null;
        }

        MainBuilder main = com.practice.order.interfaces.order.OrderDto.Main.builder();

        if ( mainResult.getOrderedAt() != null ) {
            main.orderedAt( DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss" ).format( mainResult.getOrderedAt() ) );
        }
        main.orderToken( mainResult.getOrderToken() );
        main.userId( mainResult.getUserId() );
        main.payMethod( mainResult.getPayMethod() );
        main.totalAmount( mainResult.getTotalAmount() );
        main.deliveryInfo( of( mainResult.getDeliveryInfo() ) );
        main.status( mainResult.getStatus() );
        main.statusDescription( mainResult.getStatusDescription() );
        main.orderItemList( orderItemListToOrderItemList( mainResult.getOrderItemList() ) );

        return main.build();
    }

    @Override
    public DeliveryInfo of(com.practice.order.domain.order.OrderInfo.DeliveryInfo deliveryResult) {
        if ( deliveryResult == null ) {
            return null;
        }

        DeliveryInfoBuilder deliveryInfo = DeliveryInfo.builder();

        deliveryInfo.receiverName( deliveryResult.getReceiverName() );
        deliveryInfo.receiverPhone( deliveryResult.getReceiverPhone() );
        deliveryInfo.receiverZipcode( deliveryResult.getReceiverZipcode() );
        deliveryInfo.receiverAddress1( deliveryResult.getReceiverAddress1() );
        deliveryInfo.receiverAddress2( deliveryResult.getReceiverAddress2() );
        deliveryInfo.etcMessage( deliveryResult.getEtcMessage() );

        return deliveryInfo.build();
    }

    @Override
    public com.practice.order.interfaces.order.OrderDto.OrderItem of(OrderItem orderItemResult) {
        if ( orderItemResult == null ) {
            return null;
        }

        OrderItemBuilder orderItem = com.practice.order.interfaces.order.OrderDto.OrderItem.builder();

        orderItem.orderCount( orderItemResult.getOrderCount() );
        orderItem.partnerId( orderItemResult.getPartnerId() );
        orderItem.itemId( orderItemResult.getItemId() );
        orderItem.itemName( orderItemResult.getItemName() );
        orderItem.totalAmount( orderItemResult.getTotalAmount() );
        orderItem.itemPrice( orderItemResult.getItemPrice() );
        orderItem.deliveryStatus( orderItemResult.getDeliveryStatus() );
        orderItem.deliveryStatusDescription( orderItemResult.getDeliveryStatusDescription() );
        orderItem.orderItemOptionGroupList( orderItemOptionGroupListToOrderItemOptionGroupList( orderItemResult.getOrderItemOptionGroupList() ) );

        return orderItem.build();
    }

    @Override
    public RegisterOrder of(RegisterOrderRequest request) {
        if ( request == null ) {
            return null;
        }

        RegisterOrderBuilder registerOrder = RegisterOrder.builder();

        registerOrder.userId( request.getUserId() );
        registerOrder.payMethod( request.getPayMethod() );
        registerOrder.receiverName( request.getReceiverName() );
        registerOrder.receiverPhone( request.getReceiverPhone() );
        registerOrder.receiverZipcode( request.getReceiverZipcode() );
        registerOrder.receiverAddress1( request.getReceiverAddress1() );
        registerOrder.receiverAddress2( request.getReceiverAddress2() );
        registerOrder.etcMessage( request.getEtcMessage() );
        registerOrder.orderItemList( registerOrderItemListToRegisterOrderItemList( request.getOrderItemList() ) );

        return registerOrder.build();
    }

    @Override
    public com.practice.order.domain.order.OrderCommand.RegisterOrderItem of(RegisterOrderItem request) {
        if ( request == null ) {
            return null;
        }

        RegisterOrderItemBuilder registerOrderItem = com.practice.order.domain.order.OrderCommand.RegisterOrderItem.builder();

        registerOrderItem.orderCount( request.getOrderCount() );
        registerOrderItem.itemToken( request.getItemToken() );
        registerOrderItem.itemName( request.getItemName() );
        registerOrderItem.itemPrice( request.getItemPrice() );
        registerOrderItem.orderItemOptionGroupList( registerOrderItemOptionGroupRequestListToRegisterOrderItemOptionGroupList( request.getOrderItemOptionGroupList() ) );

        return registerOrderItem.build();
    }

    @Override
    public RegisterOrderItemOptionGroup of(RegisterOrderItemOptionGroupRequest request) {
        if ( request == null ) {
            return null;
        }

        RegisterOrderItemOptionGroupBuilder registerOrderItemOptionGroup = RegisterOrderItemOptionGroup.builder();

        registerOrderItemOptionGroup.ordering( request.getOrdering() );
        registerOrderItemOptionGroup.itemOptionGroupName( request.getItemOptionGroupName() );
        registerOrderItemOptionGroup.orderItemOptionList( registerOrderItemOptionRequestListToRegisterOrderItemOptionList( request.getOrderItemOptionList() ) );

        return registerOrderItemOptionGroup.build();
    }

    @Override
    public RegisterOrderItemOption of(RegisterOrderItemOptionRequest request) {
        if ( request == null ) {
            return null;
        }

        RegisterOrderItemOptionBuilder registerOrderItemOption = RegisterOrderItemOption.builder();

        registerOrderItemOption.ordering( request.getOrdering() );
        registerOrderItemOption.itemOptionName( request.getItemOptionName() );
        registerOrderItemOption.itemOptionPrice( request.getItemOptionPrice() );

        return registerOrderItemOption.build();
    }

    @Override
    public RegisterResponse of(String orderToken) {
        if ( orderToken == null ) {
            return null;
        }

        RegisterResponseBuilder registerResponse = RegisterResponse.builder();

        registerResponse.orderToken( orderToken );

        return registerResponse.build();
    }

    @Override
    public PaymentRequest of(com.practice.order.interfaces.order.OrderDto.PaymentRequest request) {
        if ( request == null ) {
            return null;
        }

        PaymentRequestBuilder paymentRequest = PaymentRequest.builder();

        paymentRequest.orderToken( request.getOrderToken() );
        paymentRequest.amount( request.getAmount() );
        paymentRequest.payMethod( request.getPayMethod() );

        return paymentRequest.build();
    }

    protected List<com.practice.order.interfaces.order.OrderDto.OrderItem> orderItemListToOrderItemList(List<OrderItem> list) {
        if ( list == null ) {
            return null;
        }

        List<com.practice.order.interfaces.order.OrderDto.OrderItem> list1 = new ArrayList<com.practice.order.interfaces.order.OrderDto.OrderItem>( list.size() );
        for ( OrderItem orderItem : list ) {
            list1.add( of( orderItem ) );
        }

        return list1;
    }

    protected OrderItemOption orderItemOptionToOrderItemOption(com.practice.order.domain.order.OrderInfo.OrderItemOption orderItemOption) {
        if ( orderItemOption == null ) {
            return null;
        }

        OrderItemOptionBuilder orderItemOption1 = OrderItemOption.builder();

        orderItemOption1.ordering( orderItemOption.getOrdering() );
        orderItemOption1.itemOptionName( orderItemOption.getItemOptionName() );
        orderItemOption1.itemOptionPrice( orderItemOption.getItemOptionPrice() );

        return orderItemOption1.build();
    }

    protected List<OrderItemOption> orderItemOptionListToOrderItemOptionList(List<com.practice.order.domain.order.OrderInfo.OrderItemOption> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItemOption> list1 = new ArrayList<OrderItemOption>( list.size() );
        for ( com.practice.order.domain.order.OrderInfo.OrderItemOption orderItemOption : list ) {
            list1.add( orderItemOptionToOrderItemOption( orderItemOption ) );
        }

        return list1;
    }

    protected com.practice.order.interfaces.order.OrderDto.OrderItemOptionGroup orderItemOptionGroupToOrderItemOptionGroup(OrderItemOptionGroup orderItemOptionGroup) {
        if ( orderItemOptionGroup == null ) {
            return null;
        }

        OrderItemOptionGroupBuilder orderItemOptionGroup1 = com.practice.order.interfaces.order.OrderDto.OrderItemOptionGroup.builder();

        orderItemOptionGroup1.ordering( orderItemOptionGroup.getOrdering() );
        orderItemOptionGroup1.itemOptionGroupName( orderItemOptionGroup.getItemOptionGroupName() );
        orderItemOptionGroup1.orderItemOptionList( orderItemOptionListToOrderItemOptionList( orderItemOptionGroup.getOrderItemOptionList() ) );

        return orderItemOptionGroup1.build();
    }

    protected List<com.practice.order.interfaces.order.OrderDto.OrderItemOptionGroup> orderItemOptionGroupListToOrderItemOptionGroupList(List<OrderItemOptionGroup> list) {
        if ( list == null ) {
            return null;
        }

        List<com.practice.order.interfaces.order.OrderDto.OrderItemOptionGroup> list1 = new ArrayList<com.practice.order.interfaces.order.OrderDto.OrderItemOptionGroup>( list.size() );
        for ( OrderItemOptionGroup orderItemOptionGroup : list ) {
            list1.add( orderItemOptionGroupToOrderItemOptionGroup( orderItemOptionGroup ) );
        }

        return list1;
    }

    protected List<com.practice.order.domain.order.OrderCommand.RegisterOrderItem> registerOrderItemListToRegisterOrderItemList(List<RegisterOrderItem> list) {
        if ( list == null ) {
            return null;
        }

        List<com.practice.order.domain.order.OrderCommand.RegisterOrderItem> list1 = new ArrayList<com.practice.order.domain.order.OrderCommand.RegisterOrderItem>( list.size() );
        for ( RegisterOrderItem registerOrderItem : list ) {
            list1.add( of( registerOrderItem ) );
        }

        return list1;
    }

    protected List<RegisterOrderItemOptionGroup> registerOrderItemOptionGroupRequestListToRegisterOrderItemOptionGroupList(List<RegisterOrderItemOptionGroupRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<RegisterOrderItemOptionGroup> list1 = new ArrayList<RegisterOrderItemOptionGroup>( list.size() );
        for ( RegisterOrderItemOptionGroupRequest registerOrderItemOptionGroupRequest : list ) {
            list1.add( of( registerOrderItemOptionGroupRequest ) );
        }

        return list1;
    }

    protected List<RegisterOrderItemOption> registerOrderItemOptionRequestListToRegisterOrderItemOptionList(List<RegisterOrderItemOptionRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<RegisterOrderItemOption> list1 = new ArrayList<RegisterOrderItemOption>( list.size() );
        for ( RegisterOrderItemOptionRequest registerOrderItemOptionRequest : list ) {
            list1.add( of( registerOrderItemOptionRequest ) );
        }

        return list1;
    }
}
