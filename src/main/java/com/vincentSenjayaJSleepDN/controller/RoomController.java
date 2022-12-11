package com.vincentSenjayaJSleepDN.controller;

import com.vincentSenjayaJSleepDN.*;
import com.vincentSenjayaJSleepDN.dbjson.JsonAutowired;
import com.vincentSenjayaJSleepDN.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController implements BasicGetController<Room>{
    @JsonAutowired(filepath = "C:\\Users\\vince\\Prak OOP\\ProyekOOP\\JSleep\\src\\main\\java\\com\\json\\room.json", value = Room.class)

    public static JsonTable<Room> roomTable;
    public RoomController(){

    }
    @Override
    public JsonTable<Room> getJsonTable(){
        return roomTable;
    }
//    @GetMapping("/getAllRoom")
//    @ResponseBody
//    List<Room> getAllRoom(@RequestParam int page, @RequestParam int pageSize){
//        return Algorithm.paginate(roomTable, page, pageSize);
//    }
    @GetMapping("/{id}/renter")
    @ResponseBody
    List<Room> getRoomByRenter(@RequestParam int id, @RequestParam int page, @RequestParam int pageSize){
        return Algorithm.paginate(roomTable, page, pageSize, pred -> pred.accountId == id);
    }

    @PostMapping("/{id}/create")
    @ResponseBody
    public Room create(@PathVariable int id, @RequestParam String name, @RequestParam int size,
                       @RequestParam int price, @RequestParam Facility facility, @RequestParam City city,
                       @RequestParam String address){
        for (Room each : roomTable) {
            if (each != null && each.accountId == id) {
                Room room = new Room(id, name, size, new Price(price), facility, city, address);
                roomTable.add(room);
                return room;
            }
        }
        return null;
    }
}
