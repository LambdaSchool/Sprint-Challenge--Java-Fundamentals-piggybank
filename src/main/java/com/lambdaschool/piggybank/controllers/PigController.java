package com.lambdaschool.piggybank.controllers;
import com.lambdaschool.piggybank.repositories.PigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.lambdaschool.piggybank.models.Pig;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PigController
{

    @Autowired
    PigRepository pigrepos;

    @GetMapping(value = "/total",
        produces = {"application/json"})
    public ResponseEntity<?> getAllCoins()
    {
        List<Pig> myList = new ArrayList<>();
        pigrepos.findAll()
            .iterator()
            .forEachRemaining(myList::add);
        ///return names and ids
        List<Pig> rtnList = AssistingFunctions.findCoins(myList, c -> c.getCoinid());

        rtnList.sort((c1, c2) -> c1.getName()
            .compareToIgnoreCase(c2.getName()));

        return new ResponseEntity<>(rtnList,
            HttpStatus.OK);
////return the total:
        long total = 0;

        for (Pig c : myList)
        {
            total = total + c.getQuantity()*c.getValue();
        }

        System.out.println("The Piggy Bank holds" + total);
    }
}