package com.quanxiaoha.xiaohashu.note.biz.convert;

import com.quanxiaoha.xiaohashu.note.biz.domain.dataobject.NoteDO;
import com.quanxiaoha.xiaohashu.note.biz.model.dto.PublishNoteDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-22T21:41:23+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
public class NoteConvertImpl implements NoteConvert {

    @Override
    public PublishNoteDTO convertDO2DTO(NoteDO bean) {
        if ( bean == null ) {
            return null;
        }

        PublishNoteDTO.PublishNoteDTOBuilder publishNoteDTO = PublishNoteDTO.builder();

        publishNoteDTO.id( bean.getId() );
        publishNoteDTO.title( bean.getTitle() );
        publishNoteDTO.isContentEmpty( bean.getIsContentEmpty() );
        publishNoteDTO.creatorId( bean.getCreatorId() );
        publishNoteDTO.topicId( bean.getTopicId() );
        publishNoteDTO.topicName( bean.getTopicName() );
        publishNoteDTO.isTop( bean.getIsTop() );
        publishNoteDTO.type( bean.getType() );
        publishNoteDTO.imgUris( bean.getImgUris() );
        publishNoteDTO.videoUri( bean.getVideoUri() );
        publishNoteDTO.visible( bean.getVisible() );
        publishNoteDTO.createTime( bean.getCreateTime() );
        publishNoteDTO.updateTime( bean.getUpdateTime() );
        publishNoteDTO.status( bean.getStatus() );
        publishNoteDTO.contentUuid( bean.getContentUuid() );

        return publishNoteDTO.build();
    }

    @Override
    public NoteDO convertDTO2DO(PublishNoteDTO bean) {
        if ( bean == null ) {
            return null;
        }

        NoteDO.NoteDOBuilder noteDO = NoteDO.builder();

        noteDO.id( bean.getId() );
        noteDO.title( bean.getTitle() );
        noteDO.isContentEmpty( bean.getIsContentEmpty() );
        noteDO.creatorId( bean.getCreatorId() );
        noteDO.topicId( bean.getTopicId() );
        noteDO.topicName( bean.getTopicName() );
        noteDO.isTop( bean.getIsTop() );
        noteDO.type( bean.getType() );
        noteDO.imgUris( bean.getImgUris() );
        noteDO.videoUri( bean.getVideoUri() );
        noteDO.visible( bean.getVisible() );
        noteDO.createTime( bean.getCreateTime() );
        noteDO.updateTime( bean.getUpdateTime() );
        noteDO.status( bean.getStatus() );
        noteDO.contentUuid( bean.getContentUuid() );

        return noteDO.build();
    }
}
