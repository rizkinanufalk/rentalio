package com.example.rentallio;

import com.appeaser.sublimepickerlibrary.SublimePicker;
import com.appeaser.sublimepickerlibrary.datepicker.SelectedDate;
import com.appeaser.sublimepickerlibrary.datepicker.SublimeDatePicker;
import com.appeaser.sublimepickerlibrary.helpers.SublimeListenerAdapter;
import com.appeaser.sublimepickerlibrary.recurrencepicker.SublimeRecurrencePicker;

import java.text.DateFormat;

import javax.security.auth.callback.Callback;

import androidx.fragment.app.DialogFragment;

public class RangePickerFragment extends DialogFragment {
    DateFormat  dateFormat, timeFormat;
    SublimePicker sublimePicker;
    Callback nCallback;

    SublimeListenerAdapter sublimeListenerAdapter = new SublimeListenerAdapter() {

        @Override
        public void onCancelled() {
            if (nCallback != null){
            }
            dismiss();
        }

        @Override
        public void onDateTimeRecurrenceSet(SublimePicker sublimeMaterialPicker, SelectedDate selectedDate, int hourOfDay, int minute, SublimeRecurrencePicker.RecurrenceOption recurrenceOption, String recurrenceRule) {

        }
    };
}
