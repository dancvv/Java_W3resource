var app=new Vue({
    el:"#app",
    data:{
        city:"",
    },
    methods:{
        searchWeather:function () {
            console.log("天气查询");
            console.log(this.city);
            axios.get('http://wthrcdn.etouch.cn/weather_mini?city='+this.city).then(function (response) {
                console.log(response);
            })
        }

    }
})
