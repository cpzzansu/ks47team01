package ks47team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("adminOrderController")
public class AdminOrderController {

    @GetMapping("adminOrder/adminOrderManage")
    public String admin_order_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_main";
    }

    @GetMapping("adminOrder/adminOrderCheck")
    public String admin_order_check(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_check";
    }

    @GetMapping("adminOrder/adminOrderAdd")
    public String admin_order_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_add";
    }

    @GetMapping("adminOrder/adminOrderModify")
    public String admin_order_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_modify";
    }

    @GetMapping("adminOrder/adminOrderRemove")
    public String admin_order_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_remove";
    }

    @GetMapping("adminOrder/adminOrderCancelManage")
    public String admin_order_cancel_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_cancel_main";
    }

    @GetMapping("adminOrder/adminOrderCancelCheck")
    public String admin_order_cancel_check(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_cancel_check";
    }

    @GetMapping("adminOrder/adminOrderCancelAdd")
    public String admin_order_cancel_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_cancel_add";
    }

    @GetMapping("adminOrder/adminOrderCancelModify")
    public String admin_order_cancel_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_cancel_modify";
    }

    @GetMapping("adminOrder/adminOrderCancelRemove")
    public String admin_order_cancel_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_cancel_remove";
    }

    @GetMapping("adminOrder/adminOrderReturnManage")
    public String admin_order_return_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_return_main";
    }

    @GetMapping("adminOrder/adminOrderReturnCheck")
    public String admin_order_return_check(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_return_check";
    }

    @GetMapping("adminOrder/adminOrderReturnAdd")
    public String admin_order_return_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_return_add";
    }

    @GetMapping("adminOrder/adminOrderReturnModify")
    public String admin_order_return_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_return_modify";
    }

    @GetMapping("adminOrder/adminOrderReturnRemove")
    public String admin_order_return_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_return_remove";
    }

    @GetMapping("adminOrder/adminOrderExchangeManage")
    public String admin_order_exchange_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_exchange_main";
    }

    @GetMapping("adminOrder/adminOrderExchangeCheck")
    public String admin_order_exchange_check(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_exchange_check";
    }

    @GetMapping("adminOrder/adminOrderExchangeAdd")
    public String admin_order_exchange_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_exchange_add";
    }

    @GetMapping("adminOrder/adminOrderExchangeModify")
    public String admin_order_exchange_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_exchange_modify";
    }

    @GetMapping("adminOrder/adminOrderExchangeRemove")
    public String admin_order_exchange_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_exchange_remove";
    }

    @GetMapping("adminOrder/adminOrderRefundManage")
    public String admin_order_refund_main(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_refund_main";
    }

    @GetMapping("adminOrder/adminOrderRefundCheck")
    public String admin_order_refund_check(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_refund_check";
    }

    @GetMapping("adminOrder/adminOrderRefundAdd")
    public String admin_order_refund_add(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_refund_add";
    }

    @GetMapping("adminOrder/adminOrderRefundModify")
    public String admin_order_refund_modify(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_refund_modify";
    }

    @GetMapping("adminOrder/adminOrderRefundRemove")
    public String admin_order_refund_remove(Model model) {

        model.addAttribute("title", "urbanfarm");

        return "admin_order/admin_order_refund_remove";
    }
}
