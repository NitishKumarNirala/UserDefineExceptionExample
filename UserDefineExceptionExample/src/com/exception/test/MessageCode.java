package com.exception.test;

public enum MessageCode implements SystemCode {

   NULL_POINTER_EXCEPTION("getting Exception when value getting null"), 
   DATE_FORMATE_EXCEPTION("getting Exception when value getting null");

   @Override
   public String getCode() {
      return this.toString();
   }

   @Override
   public String getDefault() {
      return this.defaultMessage;
   }

   public static MessageCode getEnum(String code) {
      for (MessageCode msg : MessageCode.values()) {
         if (code != null && msg.toString().equals(code)) {
            return msg;
         }
      }
      return null;
   }

   String code;

   String defaultMessage;

   private MessageCode(String defaultMessage) {
      this.defaultMessage = defaultMessage;
   }

}
