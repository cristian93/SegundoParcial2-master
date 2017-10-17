package com.jonmid.segundoparcial.Parser;

import com.jonmid.segundoparcial.Model.TeamModelOlivaCristian;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;

/**
 * Created by chris on 17/10/2017.
 */

public class TeamJsonOlivaCeballos {
    public static List<TeamModelOlivaCristian> getData (String content ) throws JSONException{
        JSONObject jsonObject= new JSONObject(content);
        JSONArray jsonArray = jsonObject.getJSONArray("teams");

        List<TeamModelOlivaCristian> photoslist = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject item = jsonArray.getJSONObject(i);
            TeamModelOlivaCristian photos = new TeamModelOlivaCristian();

            //JSONObject teamsItem = item.getJSONObject("teams");

            //JSONObject nameitem = teamsItem.getJSONObject("name");
            //JSONObject codeitem = teamsItem.getJSONObject("code");
            //JSONObject crestUrlitem = teamsItem.getJSONObject("crest");

           // TeamModelOlivaCristian photos = new TeamModelOlivaCristian();

            photos.setName(item.getString("name"));
            photos.setCode(item.getString("code"));
            photos.setCrestUrl(item.getString("crestUrl"));

            photoslist.add(photos);
        }
        return  photoslist;
        }
}
