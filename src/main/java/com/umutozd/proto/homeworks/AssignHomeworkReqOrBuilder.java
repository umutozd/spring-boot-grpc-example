// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: homework.proto

package com.umutozd.proto.homeworks;

public interface AssignHomeworkReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:homeworks.AssignHomeworkReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string assign_to = 1;</code>
   * @return The assignTo.
   */
  java.lang.String getAssignTo();
  /**
   * <code>string assign_to = 1;</code>
   * @return The bytes for assignTo.
   */
  com.google.protobuf.ByteString
      getAssignToBytes();

  /**
   * <code>repeated .homeworks.Question questions = 2;</code>
   */
  java.util.List<com.umutozd.proto.homeworks.Question> 
      getQuestionsList();
  /**
   * <code>repeated .homeworks.Question questions = 2;</code>
   */
  com.umutozd.proto.homeworks.Question getQuestions(int index);
  /**
   * <code>repeated .homeworks.Question questions = 2;</code>
   */
  int getQuestionsCount();
  /**
   * <code>repeated .homeworks.Question questions = 2;</code>
   */
  java.util.List<? extends com.umutozd.proto.homeworks.QuestionOrBuilder> 
      getQuestionsOrBuilderList();
  /**
   * <code>repeated .homeworks.Question questions = 2;</code>
   */
  com.umutozd.proto.homeworks.QuestionOrBuilder getQuestionsOrBuilder(
      int index);
}