var Order = {
    id : 1,
    title : "Pasta",
    price : 100,
    printOrder:function() {
        console.log(`Order Id : ${this.id}, Item: ${this.title}`);
    },
    getPrice:function() {console.log(`Price : ${this.price}`);
}

};
Order.printOrder()
Order.getPrice() 