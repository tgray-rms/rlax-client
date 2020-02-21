package com.rms;

import com.rms.api.LoadClient;

public class LoadRunner {

  public static void main(String[] args) {

    String body =
        "{\"pcntRetent\":100,\"priority\":1,\"cedant\":{\"id\":\"1\",\"name\":\"test_cedant\"},\"treatyNumber\":\"1\",\"maolAmount\":0,\"attachPt\":0,\"treatyName\":\"asdf2\",\"userId1\":\"\",\"riskLimit\":0,\"userId2\":\"\",\"expireDate\":\"2021-02-20T05:01:46.413Z\",\"reinstCharge\":100,\"pcntRiShare\":100,\"occurLimit\":0,\"currency\":{\"id\":0,\"code\":\"USD\",\"name\":\"US Dollar\"},\"isValid\":true,\"lobs\":[],\"pcntPlaced\":100,\"numOfReinst\":1,\"premium\":0,\"attachBasis\":{\"id\":0,\"code\":\"L\",\"name\":\"Losses Occurring\"},\"treatyType\":{\"id\":0,\"code\":\"CATA\",\"name\":\"Catastrophe\"},\"treatyId\":1,\"pcntCovered\":100,\"retentAmt\":0,\"attachLevel\":{\"id\":0,\"code\":\"PORT\",\"name\":\"Portfolio\"},\"effectDate\":\"2020-02-20T05:01:46.413Z\"}";
    String auth =
        "Bearer eyJraWQiOiJJeFNhbkExYU5YS21hRXpTbUtxRnBXTFNCcDY0KzZDYU10NXJGdjVTRFZRPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI1OGYyMTc2NC01MmY1LTRkOWEtOGU4Yi1jODNhZTY5OGY3YWUiLCJldmVudF9pZCI6IjBmNzE0NGExLWE1MGUtNDc4Yy05ODMxLTY0YzE4YjI2OTBlNyIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE1ODIyMTAxNDUsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy1lYXN0LTEuYW1hem9uYXdzLmNvbVwvdXMtZWFzdC0xX0U4RWhyaDhzOCIsImV4cCI6MTU4MjIxMzc0NSwiaWF0IjoxNTgyMjEwMTQ1LCJqdGkiOiIyMzZmNWI4Ni0yMGIzLTQ2ZTAtYjU1Zi1mZDJiN2FhOTg1YTMiLCJjbGllbnRfaWQiOiIzMXUwNHRyYTFucWJhZmt0anU2dDByNXB1cSIsInVzZXJuYW1lIjoidGdyYXkifQ.TeqSWuJbDIAUOCnhU_iYo72Ltdn0iCMcp04WXyeyxYh69gjctSybyARHVa4B4w8GKfBw0sYwhMmB4uEYdet10VRUgW4IgFSNICqQ3bZuWWZ1RskuT3-1A5knhdTmwYpuHk63cSUsRmYTlus9kjYe_Ab3iUHo5LZYuIJlyiG-45SHpQO8WBGk306aIVmvR1gNuauirC713Dfb5AxYJq_L5x-yfZEqTdIZujsASucS9koKvPrQbKpBZWMLtiTgBKUAp0Cyg1JpZC7BJWsk_kiGDGRdNFE16Ki5BLGtc5nYLVjtaR2LZ4O7Q1m6Z4peC5QXRSirH5N8vTFEbs1JFjUyOQ";

    for (int i = 0; i < 100; i++) {
      new Thread(() -> new LoadClient().put(auth, body)).start();
    }
  }
}
