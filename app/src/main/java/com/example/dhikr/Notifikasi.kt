package com.example.dhikr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_notifikasi.*
import java.text.SimpleDateFormat
import java.util.*

class Notifikasi : AppCompatActivity(),  View.OnClickListener,TimePickerPagi.DialogTimeListener {

    private lateinit var alarmReceiver: MyReceiverPagi

    companion object {
        private const val TIME_PICKER_PAGI = "TimePickerPagi"
        private const val TIME_PICKER_SORE = "TimePickerSore"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        btn_alarm_pagi.setOnClickListener(this)
        btn_alarm_petang.setOnClickListener(this)
        btn_cancel_repeating_alarm.setOnClickListener(this)
        btn_cancel_repeating_alarm2.setOnClickListener(this)
        btn_set_repeating_alarm.setOnClickListener(this)
        btn_set_repeating_alarm2.setOnClickListener(this)

        alarmReceiver = MyReceiverPagi()
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_alarm_pagi -> {
                val timePickerFragmentRepeat = TimePickerPagi()
                timePickerFragmentRepeat.show(supportFragmentManager, TIME_PICKER_PAGI)
            }
            R.id.btn_set_repeating_alarm -> {
                val repeatTime = tv_repeating_pagi.text.toString()
                val repeatMessage = edt_repeating_message_pagi.text.toString()
                alarmReceiver.setRepeatingAlarm(this, MyReceiverPagi.TYPE_PAGI,
                    repeatTime, repeatMessage)
            }
            R.id.btn_cancel_repeating_alarm -> alarmReceiver.cancelAlarm(this, MyReceiverPagi.TYPE_PAGI)

            R.id.btn_alarm_petang -> {
                val timePickerFragmentRepeat = TimePickerPagi()
                timePickerFragmentRepeat.show(supportFragmentManager, TIME_PICKER_SORE)
            }
            R.id.btn_set_repeating_alarm2 -> {
                val repeatTime = tv_repeating_pagi.text.toString()
                val repeatMessage = edt_repeating_message_pagi.text.toString()
                alarmReceiver.setRepeatingAlarm(this, MyReceiverPagi.TYPE_SORE,
                    repeatTime, repeatMessage)
            }
            R.id.btn_cancel_repeating_alarm2 -> alarmReceiver.cancelAlarm(this, MyReceiverPagi.TYPE_SORE)
        }
    }

    override fun onDialogTimeSet(tag: String?, hourOfDay: Int, minute: Int) {


        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
        calendar.set(Calendar.MINUTE, minute)

        val dateFormat = SimpleDateFormat("HH:mm", Locale.getDefault())

        // Set text dari textview berdasarkan tag
        when (tag) {
            TIME_PICKER_PAGI -> tv_repeating_pagi.text = dateFormat.format(calendar.time)
            TIME_PICKER_SORE -> tv_repeating_petang.text = dateFormat.format(calendar.time)
            else -> {
            }
        }
    }
}