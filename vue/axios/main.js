// <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

var app=new Vue({
    el:"#app",
    data:{
        city:"武汉",
        weather:""
    },
    methods:{
        searchWeather:function () {
            console.log("天气查询");
            console.log(this.city);
            var that=this;
            axios.get('http://wthrcdn.etouch.cn/weather_mini?city='+this.city).then(function (response) {
                console.log(response.data.data.forecast);
                console.log(response.data);
                that.weather=response.data.data.forecast;
            }).catch(function (err) {
            })
        },
        changeCity(city){
            this.city=city;
            this.searchWeather();
        }

    }
})
