package com.db.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HackThonController {

   @RequestMapping("/")
   public String root() {
      return "index";
   }

   @RequestMapping("/index")
   public String index() {
      return "index";
   }

   @RequestMapping("/about-us")
   public String aboutUS() {
      return "about-us";
   }

   @RequestMapping("/events")
   public String events() {
      return "events";
   }


   @RequestMapping("/single-blog")
   public String singleBlog() {
      return "single-blog";
   }

   @RequestMapping("/elements")
   public String elements() {
      return "elements";
   }

   @RequestMapping("/contact")
   public String contact() {
      return "contact";
   }

   @RequestMapping("/causes")
   public String causes() {
      return "causes";
   }
   @RequestMapping("/blog")
   public String blog() {
      return "blog";
   }
   @RequestMapping("/event-details")
   public String eventDetails() {
      return "event-details";
   }

}
