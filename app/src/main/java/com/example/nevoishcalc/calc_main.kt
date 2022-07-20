package com.example.nevoishcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calc_main : AppCompatActivity() {
    lateinit var buttonadd:Button
    lateinit var buttonsub: Button
    lateinit var buttondiv: Button
    lateinit var buttonmult: Button
    lateinit var fnumber: EditText
    lateinit var snumber: EditText
    lateinit var ans: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_main)
        buttonadd=findViewById(R.id.plus_button)
        buttonsub=findViewById(R.id.minus_button)
        buttondiv=findViewById(R.id.div_button)
        buttonmult=findViewById(R.id.mult_button)
        fnumber=findViewById(R.id.input1)
        snumber=findViewById(R.id.input2)
        ans=findViewById(R.id.output_txt)

        buttonadd.setOnClickListener {
            var firstnumber=fnumber.toString()
            var secondnumber=snumber.toString()

            if (firstnumber.isEmpty() or  secondnumber.isEmpty()){
                ans.text="please input all fields"
            }else{
                var answer= firstnumber.toInt() + secondnumber.toInt()
                ans.text=answer.toString()

            }
        }
    }
}
           // buttonsub.setOnClickListener {

             //   var firstnumber=fnumber.toString()
            //    var secondnumber=snumber.toString()

             //   if (firstnumber.isEmpty() or  secondnumber.isEmpty()){
             //       ans.text="please input all fields"

              //  }else{
              //      var answer= firstnumber.toInt() - secondnumber.toInt()
             //       ans.text=answer.toString()
              //  }
         //   }
         //   buttondiv.setOnClickListener {

         //       var firstnumber=fnumber.toString()
         //       var secondnumber=snumber.toString()
         //
          //      if (firstnumber.isEmpty() or  secondnumber.isEmpty()){
           //         ans.text="please input all fields"
//
         //       }else{
         //           var answer= firstnumber.toInt() / secondnumber.toInt()
         //           ans.text=answer.toString()
        ////        }
        //    }
       //     buttonmult.setOnClickListener {
//
      //          var firstnumber=fnumber.toString()
      //          var secondnumber=snumber.toString()
//
     //           if (firstnumber.isEmpty() or  secondnumber.isEmpty()){
    //                ans.text="please input all fields"
//
    //            }else{
    //                var answer= firstnumber.toInt() * secondnumber.toInt()
   //                 ans.text=answer.toString()
    //            }
   //         }
//
  //      }
  //  }
//}