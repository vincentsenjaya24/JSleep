package com.vincentSenjayaJSleepDN;
import com.vincentSenjayaJSleepDN.dbjson.Serializable;

import java.util.*;
/**
 * Class Invoice berisi status dan rating terhadap kamar
 * @author Vincent Senjaya
 * @version 1.0
 * @since 11 Desember 2021
 */
public class Invoice extends Serializable
{
   public int buyerId;
   public int renterId;
   public PaymentStatus status;
   public RoomRating rating;

   
   public enum RoomRating{
       NONE,BAD,NEUTRAL,GOOD
   }
   
   public enum PaymentStatus{
       FAILED,WAITING,SUCCESS
   }
   
   protected Invoice(int buyerId, int renterId){
       super();
       this.buyerId = buyerId;
       this.renterId = buyerId;
       this.rating = RoomRating.NONE;
       this.status = PaymentStatus.WAITING;
   }
   
   public Invoice(Account buyer, Renter renter){
       super();

       this.rating = RoomRating.NONE;
       this.status = PaymentStatus.WAITING;
   }
   
   public String print(){
       return (String)("Buyer ID: " +buyerId + "\nRenter ID: " + renterId );
   }
}
