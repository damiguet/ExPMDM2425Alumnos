package dam.pmdm.exam20241t

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class QuestionFragment : Fragment() {

    private lateinit var responder:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quest, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        responder=view.findViewById(R.id.autorespuesta)
        //TODO Configura el botón responder para que responda el cuestionario con tus respuestas


        //fin Configura el botón responder para que responda el cuestionario con tus respuestas

    }



}