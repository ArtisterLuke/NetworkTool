package com.artist.wolf.networktool;

import com.artist.wolf.networktool.domain.Response;

public abstract class NetworkResponseCallback  {
    protected abstract void onResponse(Response response);
}
