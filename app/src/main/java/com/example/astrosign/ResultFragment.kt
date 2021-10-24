package com.example.astrosign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.astrosign.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding?=null
    private val binding get()=_binding!!

    val args:ResultFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentResultBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.image.setImageResource(getImage(args.date,args.month))
        binding.text.text= getAbout(args.date,args.month)


    }
    private fun getImage(date:Int,month:Int):Int{
        if ((month==3 && date>=21) || (month==4 && date<=19))
            return R.drawable.aries
        if ((month==4 && date>=20) || (month==5 && date<=20))
            return R.drawable.taurus
        if ((month==5 && date>=21) || (month==6 && date<=20))
            return R.drawable.gemini
        if ((month==6 && date>=21) || (month==7 && date<=22))
            return R.drawable.cancer
        if ((month==7 && date>=23) || (month==8 && date<=22))
            return R.drawable.leo
        if ((month==8 && date>=23) || (month==9 && date<=22))
            return R.drawable.virgo
        if ((month==9 && date>=23) || (month==10 && date<=22))
            return R.drawable.libra
        if ((month==10 && date>=23) || (month==11 && date<=21))
            return R.drawable.scorpio
        if ((month==11 && date>=22) || (month==12 && date<=21))
            return R.drawable.sagittarius
        if ((month==12 && date>=22) || (month==1 && date<=19))
            return R.drawable.capricorn
        if ((month==1 && date>=20) || (month==2 && date<=18))
            return R.drawable.aquarius
        if ((month==2 && date>=19) || (month==3 && date<=20))
            return R.drawable.pisces
        return R.drawable.ic_launcher_background
    }
    private fun getAbout(date: Int,month: Int):String{
        if ((month==3 && date>=21) || (month==4 && date<=19))
            return "Aries possess a good and a just nature. Aries men are defiant of masculinity. Aries people want to stand their ground. You always stand true to your words and actions. But your aggressive nature can sometime damage your stable relationship with your folks, so you need to be watchful of your words before you utter them. "

        if ((month==4 && date>=20) || (month==5 && date<=20))
            return "Everything we do shapes us and it is not only what we do right, but also the mistakes we commit. If you want to overcome the temptation of impulse buying, wait for a day without buying it; afterwards, you may realise it is not worth spending money on. "
        if ((month==5 && date>=21) || (month==6 && date<=20))
            return "Shop owners and retailers are likely to take steps to promote and enhance their trade to make it profitable once again. It is important to get familiar with the format of competitive exams; do so by solving previous years' question papers. Strive for healthy relationships within the family to boost happiness. Poor lifestyle due to inactivity and consumption of junk food may get you out of shape"
        if ((month==6 && date>=21) || (month==7 && date<=22))
            return "If you are keen to buy a house, ensure other financial resources, in addition to the home loan. The charm of a vacation destination you are visiting can be so captivating as to make you spend a few more days there. At times you need to listen to your inner voice for guidance."
        if ((month==7 && date>=23) || (month==8 && date<=22))
            return "Those preparing for competitive exams will need to create specific goals for each study session; this way they will methodically cover everything. Always track your expenses to put a check on impulse buying. If you want children to be perfect in every respect, lead by example."
        if ((month==8 && date>=23) || (month==9 && date<=22))
            return "Domestic harmony prevails at home, as you infuse warmth and affection to make your home a happy place to be in. your airline is likely to resolve the problems faced by you in catching a connecting flight. If you feel that a new health supplement is not agreeing with your system, it is best to discontinue it. Homemakers may go on a shopping spree."
        if ((month==9 && date>=23) || (month==10 && date<=22))
            return "You will love lazing around in a charming countryside resort that you plan to spend your vacation in. Your desire to excel in academics may prod you to get serious about your studies. A family elder may feel wanted if you simply interact and ask about his/ her feelings and interests."
        if ((month==10 && date>=23) || (month==11 && date<=21))
            return "You will be very content with where you are in life as far as your profession is concerned. By condensing your revision notes into one-page diagrams, you can prepare better and in lesser time. Finding a buyer for property may be difficult, but you will find one. You will need to hire a fitness trainer to get a sculpted body."
        if ((month==11 && date>=22) || (month==12 && date<=21))
            return "Instead of booking a property, you may buy a piece of land through auction. With teenage youngsters doing their own thing, there is a chance of breakdown in the lines of communication; don't let that happen by interacting with them daily."
        if ((month==12 && date>=22) || (month==1 && date<=19))
            return "Freelancers are likely to earn handsomely. If you think money doesn't buy happiness; remember, it gives you freedom, opportunity and options. Setting realistic and measurable goals will certainly get you back in shape. If you want your trip to be flawless, don't forget to carry the essentials"
        if ((month==1 && date>=20) || (month==2 && date<=18))
            return "Your efforts at work are likely to get noticed by those who matter. Something you have achieved in academics will open many doors for you. Those starting hostel life may share their concerns about adapting to a different life and getting along with others, so be supportive. Introduce some sort of moderate physical activity in your everyday life."
        if ((month==2 && date>=19) || (month==3 && date<=20))
            return "Keeping track of your daily expenditure will help curb living beyond your means to a large extent. Having six meals a day with smaller portions, instead of three large meals, would be good for your metabolism. Booking property in a city where you aim to ultimately settle is the right step to take."
        return "Please enter correct Date of Birth Thank You!"
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}