package com.example.controller;

import com.example.entity.Book;
import com.example.exception.BookNotFound;
import com.example.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by Developer on 2016/9/15.
 */
@Controller
@RequestMapping(value="/book")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value="/create", method=RequestMethod.GET)
    public ModelAndView newBookPage() {
        ModelAndView mav = new ModelAndView("book-new", "book", new Book());
        return mav;
    }

    @RequestMapping(value="/create", method= RequestMethod.POST)
    public ModelAndView createNewBook(Book book,
                                      final RedirectAttributes redirectAttributes) {

        ModelAndView mav = new ModelAndView();
        String message = "New book "+book.getTitle()+" was successfully created.";

        shopService.create(book);
        mav.setViewName("redirect:/");

        redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView shopListPage() {
        ModelAndView mav = new ModelAndView("book-list");
        List<Book> shopList = shopService.findAll();
        mav.addObject("shopList", shopList);
        return mav;
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
    public ModelAndView editShopPage(@PathVariable String id) {
        ModelAndView mav = new ModelAndView("book-edit");
        Book book = shopService.findById(id);
        mav.addObject("book", book);
        return mav;
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
    public ModelAndView editShop(Book book,
                                 @PathVariable String id,
                                 final RedirectAttributes redirectAttributes) throws BookNotFound {

        ModelAndView mav = new ModelAndView("redirect:/");
        String message = "Book was successfully updated.";

        shopService.update(book);

        redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public ModelAndView deleteShop(@PathVariable String id,
                                   final RedirectAttributes redirectAttributes) throws BookNotFound {

        ModelAndView mav = new ModelAndView("redirect:/");

        Book book = shopService.delete(id);
        String message = "The book "+book.getTitle()+" was successfully deleted.";

        redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }

}