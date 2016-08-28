package com.garuda.BO;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

/**
 * Created by ishan on 8/26/2016.
 */
public class MediaBO {
    @Getter @Setter private String mediaId;
    @Getter @Setter private String mediaType;
    @Getter @Setter private String encoding;
    @Getter @Setter private String length;
    @Getter @Setter private LocationBO startLocation;
    @Getter @Setter private LocationBO endLocation;
    @Getter @Setter private Boolean isPublic;
    @Getter @Setter private Date uploadDate;
}
