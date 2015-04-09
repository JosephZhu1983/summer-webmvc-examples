package net.summerframework.examples.mvc.filters;

import net.summerframework.mvc.filter.*;

/**
 * http://www.SummerFramework.net
 * Joseph Zhu
 * yzhu@live.com
 */
public class GeneralFilter1 implements IGeneralFilter
{
    public void onActionExecuting(ActionExecutingContext actionExecutingContext)
    {
        actionExecutingContext.getHttpContext().write(this.getClass().getName());
    }

    public void onActionExecuted(ActionExecutedContext actionExecutedContext)
    {
        actionExecutedContext.getHttpContext().write(this.getClass().getName());
    }

    public void onException(ExceptionContext exceptionContext)
    {

    }

    public void onResultExecuting(ResultExecutingContext resultExecutingContext)
    {

    }

    public void onResultExecuted(ResultExecutedContext resultExecutedContext)
    {

    }
}
