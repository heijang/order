package com.practice.order.interfaces.order.gift;

import com.practice.order.domain.order.OrderCommand.PaymentRequest;
import com.practice.order.domain.order.OrderCommand.PaymentRequest.PaymentRequestBuilder;
import com.practice.order.domain.order.OrderCommand.RegisterOrder;
import com.practice.order.domain.order.OrderCommand.RegisterOrder.RegisterOrderBuilder;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItem.RegisterOrderItemBuilder;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItemOption;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItemOption.RegisterOrderItemOptionBuilder;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItemOptionGroup;
import com.practice.order.domain.order.OrderCommand.RegisterOrderItemOptionGroup.RegisterOrderItemOptionGroupBuilder;
import com.practice.order.interfaces.order.gift.GiftOrderDto.RegisterOrderItem;
import com.practice.order.interfaces.order.gift.GiftOrderDto.RegisterOrderItemOptionGroupRequest;
import com.practice.order.interfaces.order.gift.GiftOrderDto.RegisterOrderItemOptionRequest;
import com.practice.order.interfaces.order.gift.GiftOrderDto.RegisterOrderRequest;
import com.practice.order.interfaces.order.gift.GiftOrderDto.RegisterResponse;
import com.practice.order.interfaces.order.gift.GiftOrderDto.RegisterResponse.RegisterResponseBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-23T15:02:55+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.2.jar, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class GiftOrderDtoMapperImpl implements GiftOrderDtoMapper {

    @Override
    public RegisterOrder of(RegisterOrderRequest request) {
        if ( request == null ) {
            return null;
        }

        RegisterOrderBuilder registerOrder = RegisterOrder.builder();

        registerOrder.userId( request.getBuyerUserId() );
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
    public PaymentRequest of(com.practice.order.interfaces.order.gift.GiftOrderDto.PaymentRequest request) {
        if ( request == null ) {
            return null;
        }

        PaymentRequestBuilder paymentRequest = PaymentRequest.builder();

        paymentRequest.orderToken( request.getOrderToken() );
        paymentRequest.amount( request.getAmount() );
        paymentRequest.payMethod( request.getPayMethod() );

        return paymentRequest.build();
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
