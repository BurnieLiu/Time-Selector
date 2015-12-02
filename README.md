# Time-Selector
[ ![Download](https://api.bintray.com/packages/liuli/maven/Time-Selector/images/download.svg) ](https://bintray.com/liuli/maven/Time-Selector/_latestVersion) 
####控件基于[jingchenUSTC/TimePicker](https://github.com/jingchenUSTC/TimePicker "感谢jingchenUSTC" )

---


![Loading](http://7xosuk.com1.z0.glb.clouddn.com/aaa.gif)




使用：
>Android Studio中直接在 gradle中加入：
<pre><code>compile 'com.feezu.liuli:timeselector:1.0.0'</code></pre>

构造1：
><pre><code>TimeSelector(Context context, ResultHandler resultHandler, String startDate, String endDate)</code></pre>
>参数说明：ResultHandler为选取时间后的回调 startDate，endDate为时间控件的可选起始时间和结束时间。

        TimeSelector timeSelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                Toast.makeText(getApplicationContext(), time, Toast.LENGTH_LONG).show();
            }
        }, "2015-11-22 17:34", "2015-12-1 15:20");


构造2：
><pre><code>TimeSelector(Context context, ResultHandler resultHandler, String startDate, String endDate, String workStartTime, String workEndTime)</code></pre>
>参数说明：传入workStartTime，workEndTime可选时间为起始时间和结束时间范围内的每日“时：分”的起始和结束时间，如限制可选时间为：朝9晚5。

		TimeSelector timeSelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                Toast.makeText(getApplicationContext(), time, Toast.LENGTH_LONG).show();
            }
        }, "2015-10-30 10:34", "2015-12-1 17:34","9:00","17:00");

使用：
><pre><code>timeSelector.show();</code></pre>



 


