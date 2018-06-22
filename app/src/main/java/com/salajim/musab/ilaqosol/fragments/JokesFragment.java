package com.salajim.musab.ilaqosol.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.salajim.musab.ilaqosol.R;
import com.salajim.musab.ilaqosol.adapters.JokesCategoriesAdapter;
import com.salajim.musab.ilaqosol.models.Categories;
import com.twotoasters.jazzylistview.JazzyHelper;
import com.twotoasters.jazzylistview.JazzyListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class JokesFragment extends Fragment {
    @Bind(R.id.jazz) JazzyListView jazzyListView;
    private JokesCategoriesAdapter mAdapter;
    private List<Categories> categories;


    public JokesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jokes, container, false);
        ButterKnife.bind(this, view);

        categories = new ArrayList<>();

        mAdapter = new JokesCategoriesAdapter(categories, getActivity());
        jazzyListView.setAdapter(mAdapter);

        jazzyListView.setTransitionEffect(JazzyHelper.CARDS);

        displayJokes();

        return view;
    }

    private void displayJokes() {
        Categories category = new Categories("Sheko qosol badan Juxa iyo gabadhii loo guuriyay", "Maalin malmaha kamid ah ayaa" +
                " Juxa gabar loo doonay, inkasto Juxa gabadhaas uusan horay u arag, waxaa loo sheegay inay quruxbadan tahay oo ay aad uqancin donto" +
                " Markii Juxa habenki gabadha loo soo galbiyay, wuxuu arkay in gabadhu ay fool xuma kudhamaatay. " +
                "Waagii marku bariyay ayaa gabadhii waxay Juxa ku tiri, ”Juxoow, nimanka qaraabadaada ah ii kala sheeg , kuwa aan iska asturayo iyo kuwa kale”" +
                "Juxa oo qoslaya ayaa ugu jawaabay, ”Dadka oo dhan u muuqo , laakin aniga iska key astur!!!!!”\n KKKKKKKK");
        categories.add(category);

        category = new Categories("Sheeko qosol badan nin tuugsade ah", "Habeen habeenada ka mid ah " +
                "nin tuugsade ah ayaa wuxuu soo maray rag gurigooda ku cawaynayo, markaasuu ku yidhi, Liiiiibaaaan. Waxay ku jawaaben " +
                "Alle ha ina siiyo. Markaasu yidhi Xitaa jab roodhi ah oo qalel ah maad isiisaan, waxay ku jawaaben Ma haysano " +
                "Markaasu yidhi xoogahaas haraaga ah maa isiisan, markaasay yidhaahdeen Ma awoodno " +
                "Isagoo quursi ku dhaw ayuu ku yidhi Hadaba koob biyo ah isiiya, waxay ku yidhaahdeen " +
                "biyo nooma yaalan. Ninkii oo yaaban aya ku yidhi Waa maxay meesha aad fadhidaan " +
                "ina kena aan wada tuugsanee illeen idinkaa iga mudan tuugsashada!!!!!\n KKKKKKKK");
        categories.add(category);

        category = new Categories("Sheeko qosol badan Juxa iyo lacagtii Dameerka", "Maalin maalmaha ka mid ah " +
                "ayaa Juxa aaday suuqa lagu iibiyo Xaywaanada si uu usoo gato Dameer. " +
                "Intuu wada socoday Ayaa nin wadada ku istaajiyay, ninkii ayaa waydiiyay Juxa halka uu usocdo. " +
                "Juxa ayaa usheegay inoo doonayo inoo soo gato Dameer. Ninkii ayaa ku dhahay, “Juxoow Insha Allah dheh!” " +
                "Juxa ayaa ku jawaabay, ”Insha Allah dhihi maayo, ilayn lacagta jeebkaan ku sitaa, dameerkana suuqa ayuu yaalaa” " +
                "Juxa ayaa suuqa ka soo laabtay, asigoon dameer wadan. " +
                "Ninkii ayaa mar kale weediiyay, “Juxoow dameerkii aaway?” " +
                "Juxa ayaa ku jawaabay, “Lacagtii INSHA ALLAH baa xaday!” Asigoo ula jeedo lacagtii inay ka luntay!\n KKKKKKKK");
        categories.add(category);

        category = new Categories("Nin bariis ku gubtay Sheeko qosol badan", "Maalin maalmaha kamid ah ayaa nin bariis aad u kulul " +
                "cantuugay! Markii uu afkii ka gubtay ayuu isyidhi hadii aad bariiska soo tufto dadka ayaa kula yaabi doona! " +
                "Markaas ayuu ku adkaystay inuu bariiska kulul afka ku celiyo oo kulaylka iska xamilo! " +
                "Ninkii ayaa xanuun awgii ilmeeyay! Wadaad ninkii hor fadhiyaay oo yaaban ayaa ninkii waydiiyay waar maxaa ku helay ood la ilmaynaysaa? " +
                "Ninkii ayaa wadaadkii ugu jawaabay: Dhibkii Nebiga (csw) loo gaystay ayaan yara xasuustay oo waan qiirooday!\n KKKKKKKK");
        categories.add(category);

        category = new Categories("Dagaal laba nin dhax maray Sheeko qosol badan", "Waxaa dagaal dax maray laba nin, " +
                "marka mid ayaa waxaa lagu bilaabay feer, laakin kii kalena wuu caaytamaayey inta dagaalka socday " +
                "Markii dagaalkii uu dhamaaday ayaa waxa la weydiiyay maxaad isaga celin waayday ninka feerka kula dhacayey? " +
                "Markaas buu ku jawaabay: idinka waxaad arkeyseen feerkiisa, wixi cay afkeyga ka baxaayay ma arkaynin miyaa? " +
                "Xasidiin ayaa  tihiin, walee isagaad la jirteen! " +
                "wixii gacmaha ihaayay idinku ahaa ee aan far la dhaqaajin kari waayey!!!\n KKKKKKKK");
        categories.add(category);

        category = new Categories("Sheko qosol badan Juxa iyo nin xamaali ah", "Maalin maalmaha kamid ah aya Juxa " +
                "soo aaday suuqa is uu uga soo iibsado kiish bur ama daqiiq ah, markuu iibsaday kiishkii daqiiqda ahaa " +
                "ayaa wuxuu u yeedhay nin xamaali ah oo gaadhi gacan wata si uu ugu geeyo gurigiisa. " +
                "Juxaa iyo xamaaligii oo kaaryoonaha kuwada burkii ayaa is dabagalay, iyagoo isdaba socda " +
                "ayaa waxay soo dhex-mareen meel ka mida suuqii oo ay dadku aad ugu badan yihiin aadna cidhiidhi u ah. " +
                "Muddo ka dib Juxa iyo ninkii xamaaliga ahaa ee waday kiishka burka ah ayaa ku kala lumay suuqa dhexdiisii. " +
                "Inkastoo uu juxa si aad ah uga dhex-baadi goobay suuqa ninkii xamaaliga ahaa, " +
                "haddana markii danbe wuu ka quustay inuu arko wuxuuna iska beegsady isagagoo ku daalay raadintii xamaaliga gurigiisii! " +
                "Maalmo ka dib juxaa wuxuu arkay ninkii xamaaliga ahaa, hase ahaate Juxa wuu ka dhuuntay " +
                "xamaaligii uu ku ogaa kiishkii daqiiqda ahaa! Qaar ka mid ah asxaabtii Juxa ayaa suaalay " +
                "sababta uu juxaa uga dhuuntay ninka xamaaliga ahaa ee kiishkiisii burka ahaa la maqan? " +
                "Balse Juxa ayaa ugu jawaabay saaxiibadii, \"waxaan ka baqayaa inuu i waydiisto lacagtii xamaaliga ahaa ilaa maanta!\" \n KKKKKKKK");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo maseyr ah", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan nin waalan", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        mAdapter.notifyDataSetChanged();
    }


}
