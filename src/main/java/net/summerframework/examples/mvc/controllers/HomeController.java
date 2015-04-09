package net.summerframework.examples.mvc.controllers;

import net.summerframework.mvc.action.ActionResult;
import net.summerframework.mvc.controller.Controller;
import net.summerframework.mvc.filter.GeneralFilter;
import net.summerframework.examples.mvc.filters.*;

/**
 * http://www.SummerFramework.net
 * Joseph Zhu
 * yzhu@live.com
 */
public class HomeController extends Controller
{
    @GeneralFilter(type = GeneralFilter1.class)
    @GeneralFilter(type = GeneralFilter2.class)
    public ActionResult index()
    {
        return content("index");
    }

    public ActionResult about()
    {
        return content("about");
    }
}
