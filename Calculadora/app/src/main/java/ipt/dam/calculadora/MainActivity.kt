package ipt.dam.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import ipt.dam.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var num1:String = "0"
    private var num2:String = "0"
    private var op:Char = '+'
    private var clearVisor:Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.visor = "0"
    }

    fun click0(view: View) {
        if (clearVisor) {
            num2 = "0"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "0"
        else
            num2 += "0"
        binding.visor = num2.toString()
    }

    fun click1(view: View) {
        if (clearVisor) {
            num2 = "1"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "1"
        else
            num2 += "1"
        binding.visor = num2.toString()
    }

    fun click2(view: View) {
        if (clearVisor) {
            num2 = "2"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "2"
        else
            num2 += "2"
        binding.visor = num2.toString()
    }

    fun click3(view: View) {
        if (clearVisor) {
            num2 = "3"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "3"
        else
            num2 += "3"
        binding.visor = num2.toString()
    }

    fun click4(view: View) {
        if (clearVisor) {
            num2 = "4"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "4"
        else
            num2 += "4"
        binding.visor = num2.toString()
    }

    fun click5(view: View) {
        if (clearVisor) {
            num2 = "5"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "5"
        else
            num2 += "5"
        binding.visor = num2.toString()
    }

    fun click6(view: View) {
        if (clearVisor) {
            num2 = "6"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "6"
        else
            num2 += "6"
        binding.visor = num2.toString()
    }

    fun click7(view: View) {
        if (clearVisor) {
            num2 = "7"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "7"
        else
            num2 += "7"
        binding.visor = num2.toString()
    }

    fun click8(view: View) {
        if (clearVisor) {
            num2 = "8"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "8"
        else
            num2 += "8"
        binding.visor = num2.toString()
    }

    fun click9(view: View) {
        if (clearVisor) {
            num2 = "9"
            clearVisor = false
        } else if (num2 == "0")
            num2 = "9"
        else
            num2 += "9"
        binding.visor = num2.toString()
    }

    fun clickdiv(view: View) {
        num1 = calc(num1, num2, op)
        binding.visor = num1
        op='/'
        clearVisor = true;
    }

    fun clickmul(view: View) {
        num1 = calc(num1, num2, op)
        binding.visor = num1
        op='*'
        clearVisor = true;
    }

    fun clicksum(view: View) {
        num1 = calc(num1, num2, op)
        binding.visor = num1
        op='+'
        clearVisor = true;
    }

    fun clicksub(view: View) {
        num1 = calc(num1, num2, op)
        binding.visor = num1
        op='-'
        clearVisor = true;
    }

    fun clickequals(view: View) {
        num1 = calc(num1, num2, op)
        binding.visor = num1
        clearVisor = true;
    }

    fun clickclear(view: View) {
        binding.visor = "0"
        num1="0"
        num2="0"
        op='+'
    }

    fun calc(num1:String, num2:String, op:Char):String {
        var n1= Integer.parseInt(num1)
        var n2= Integer.parseInt(num2)
        var n3=0;
        if (op=='+') n3= n1+n2;
        else if (op=='-') n3= n1-n2;
        else if (op=='*') n3= n1*n2;
        else n3= n1/n2;
        return n3.toString()
    }
}