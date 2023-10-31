//package com.hrisi.supplychain.controllers;
//
//import com.hrisi.supplychain.entities.UserEntity;
//import com.hrisi.supplychain.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class TestController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping("/test")
//    public UserEntity test() {
//        List<UserEntity> userEntityList = userRepository.findAll();
//        System.out.println("DB state: " + userEntityList);
//
//        UserEntity user1 = userRepository.save(new UserEntity("vladi", 29));
//        System.out.println("Created user: " + user1);
//
//        List<UserEntity> userEntitiesAfterInsert = userRepository.findAll();
//        System.out.println("DB state after insert: " + userEntitiesAfterInsert);
//
//        return user1;
//    }
//}
