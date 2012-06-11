/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package elemental.html;
import elemental.dom.Element;
import elemental.events.EventListener;

import elemental.events.*;
import elemental.util.*;
import elemental.dom.*;
import elemental.html.*;
import elemental.css.*;
import elemental.stylesheets.*;

import java.util.Date;

/**
  * <code>&lt;frameset&gt;</code> is an HTML element which is used to contain <code><a rel="custom" href="https://developer.mozilla.org/en/HTML/Element/frame">&lt;frame&gt;</a></code>
 elements.
  */
public interface FrameSetElement extends Element {

  String getCols();

  void setCols(String arg);

  EventListener getOnbeforeunload();

  void setOnbeforeunload(EventListener arg);

  EventListener getOnblur();

  void setOnblur(EventListener arg);

  EventListener getOnerror();

  void setOnerror(EventListener arg);

  EventListener getOnfocus();

  void setOnfocus(EventListener arg);

  EventListener getOnhashchange();

  void setOnhashchange(EventListener arg);

  EventListener getOnload();

  void setOnload(EventListener arg);

  EventListener getOnmessage();

  void setOnmessage(EventListener arg);

  EventListener getOnoffline();

  void setOnoffline(EventListener arg);

  EventListener getOnonline();

  void setOnonline(EventListener arg);

  EventListener getOnpopstate();

  void setOnpopstate(EventListener arg);

  EventListener getOnresize();

  void setOnresize(EventListener arg);

  EventListener getOnstorage();

  void setOnstorage(EventListener arg);

  EventListener getOnunload();

  void setOnunload(EventListener arg);

  String getRows();

  void setRows(String arg);
}