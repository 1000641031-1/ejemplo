package com.example.viewpager

data class IntroSlider(
    val text_question_header_2 : String
)

/*

package com.mvvm.mvvmandroid.presentation.scenes.requestform.fillrequestedform

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.core.view.get
import androidx.core.view.isEmpty
import androidx.recyclerview.widget.RecyclerView
import com.mvvm.mvvmandroid.R
import com.mvvm.mvvmandroid.data.model.saveanswers.QuestionAnsweredFormResults
import com.mvvm.mvvmandroid.data.model.saveform.Question
import com.mvvm.mvvmandroid.presentation.scenes.createform.fillquestions.QuestionCardViewAdapter
import kotlinx.android.synthetic.main.card_answer_question.view.*


class AnswerCardViewAdapter(private val mContext: Context,
                            private val questionsList: List<Question>?
) : RecyclerView.Adapter<AnswerCardViewAdapter.AnswerCardViewViewHolder>(mContext, 0, questionsList!!) {

    private val answers : ArrayList<QuestionCardViewAdapter> = ArrayList()
    inner class AnswerCardViewViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val layout = LayoutInflater.from(context).inflate(
                R.layout.card_answer_question, parent, false
            )

            layout.text_id_question_2.text = "${position + 1}"
            layout.text_question_header_2.text = questionsList?.get(position)?.getQuestionHeader()

            val numberAnswers = questionsList?.get(position)?.getAnswersSize()

            layout.radiogroup_answers


            for (i in 1..numberAnswers!!) {
                val texto = layout.radiogroup_answers.checkedRadioButtonId
                val vistas = layout.radiogroup_answers.findViewById<RadioButton>(texto)

                val radioButton = RadioButton(mContext)
                radioButton.setText(questionsList?.get(position)?.getOption(i))
                radioButton.textSize = 18f
                radioButton.id = i
                layout.radiogroup_answers.addView(radioButton)
            }

*/
/*OM-8M5HH8*//*


            layout.radiogroup_answers.setOnCheckedChangeListener { p0, p1 ->

                val texto = layout.radiogroup_answers.checkedRadioButtonId
                val vistas = layout.radiogroup_answers.findViewById<RadioButton>(texto)
                vistas.isChecked = true
                Log.i("Checked", "Esta opcion es la número ${texto} y tiene ${vistas.text}")
                val positionInAnswers = position + 1
                */
/* if(answers.size >= position+1){
                    answers.set(position, QuestionAnswered(positionInAnswers.toString(),Option(vistas.text.toString())))
                }else{
                    answers.add(QuestionAnswered(positionInAnswers.toString(),Option(vistas.text.toString())))
                }*//*


                //Log.i("Checked", "Para la pregunta ${answers.get(position).QuestionId}, el usuario respondió ${answers[position].Answer.toString()}")
                Log.i("Checked", "Tengo ${answers.size} respuestas")

            }

            return layout
        }


        fun checkAnswers(): Boolean {
            Log.i("Checked", "Tengo un total de ${answers.size}")
            var status: Boolean = true

            if (answers.size == 0) {
                status = false
            } else {
                loop@ for (index in 0 until answers.size) {
                    if (answers.get(index) == null) {
                        status = false
                        break@loop
                    }
                }
            }
            return status
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswerCardViewViewHolder {
        return AnswerCardViewViewHolder()
    }

    override fun onBindViewHolder(holder: AnswerCardViewViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
*/
